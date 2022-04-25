package com.mk.erp.dfr.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mk.erp.dfr.dao.FoodRecommendationDAO;
import com.mk.erp.dfr.dto.RecommendationDTO;
import com.mk.erp.dfr.entity.DiseaseEntity;
import com.mk.erp.dfr.entity.RecommendationEntity;

@Service
public class FoodRecommendationService {

	@Autowired
	private FoodRecommendationDAO dao;

	public RecommendationDTO foodRecommendation(RecommendationDTO foodRecommendation) {
		RecommendationDTO recommendationDTO = new RecommendationDTO();
		DiseaseEntity DiseaseEntity = dao.findById(foodRecommendation.getDiseaseId());

		List<String> getVegtableList = dao.getVegtables(foodRecommendation.getDiseaseId());

		List<String> getFruitsList = dao.getFruits(foodRecommendation.getDiseaseId());

		List<String> getFoodList = dao.getFood(foodRecommendation.getDiseaseId());

		if (null != DiseaseEntity) {
			recommendationDTO.setDiseaseName(DiseaseEntity.getDiseaseName());
		}
		recommendationDTO.setDiseaseId(foodRecommendation.getDiseaseId());
		List<String> vegtablesList = new ArrayList<>();
		List<String> fruitsList = new ArrayList<>();
		List<String> foodList = new ArrayList<>();

		getVegtableList.forEach((veg) -> {
			if (!veg.isEmpty() && null != veg)
				vegtablesList.add(veg);
		});
		getFruitsList.forEach((fruit) -> {
			if (!fruit.isEmpty() && null != fruit)
				fruitsList.add(fruit);
		});
		getFoodList.forEach((food) -> {
			if (!food.isEmpty() && null != food)
				foodList.add(food);
		});

		recommendationDTO.setVegetablesList(vegtablesList);
		recommendationDTO.setFruitsList(fruitsList);
		recommendationDTO.setFoodList(foodList);

		return recommendationDTO;
	}

	public ByteArrayInputStream foodRecommendationPdf(RecommendationDTO foodRecommendation) {

		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		try {
			DiseaseEntity DiseaseEntity = dao.findById(foodRecommendation.getDiseaseId());

			PdfWriter.getInstance(document, out);
			document.open();

			Paragraph para = new Paragraph("Food Recommendation for " + DiseaseEntity.getDiseaseName());
			para.setAlignment(Element.ALIGN_CENTER);
			document.add(para);
			document.add(Chunk.NEWLINE);
			List<RecommendationEntity> foodRecommendationList = dao.foodRecommendationList(foodRecommendation);

			PdfPTable table = new PdfPTable(3);
			table.setHorizontalAlignment(Element.ALIGN_CENTER);

			PdfPCell vegtableHeader = new PdfPCell(new Phrase("Vegtable"));
			vegtableHeader.setBackgroundColor(BaseColor.YELLOW);

			PdfPCell fruitHeader = new PdfPCell(new Phrase("Fruit"));
			fruitHeader.setBackgroundColor(BaseColor.YELLOW);

			PdfPCell foodHeader = new PdfPCell(new Phrase("Food"));
			foodHeader.setBackgroundColor(BaseColor.YELLOW);

			table.addCell(vegtableHeader);
			table.addCell(fruitHeader);
			table.addCell(foodHeader);

			for (RecommendationEntity RecommendationEntity : foodRecommendationList) {

				PdfPCell vegtableData = new PdfPCell(new Phrase(RecommendationEntity.getVegetables()));

				PdfPCell fruitData = new PdfPCell(new Phrase(RecommendationEntity.getFruits()));

				PdfPCell foodData = new PdfPCell(new Phrase(RecommendationEntity.getFood()));

				table.addCell(vegtableData);
				table.addCell(fruitData);
				table.addCell(foodData);
			}

			document.add(table);

			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ByteArrayInputStream(out.toByteArray());
	}

	public ByteArrayInputStream foodRecommendationExcel(RecommendationDTO foodRecommendation) {
		DiseaseEntity DiseaseEntity = dao.findById(foodRecommendation.getDiseaseId());

		ByteArrayOutputStream outStrem = new ByteArrayOutputStream();

		try {
			Workbook workBook = new HSSFWorkbook();
			Sheet sheet = workBook.createSheet(DiseaseEntity.getDiseaseName());
			Row row = sheet.createRow(1);
			Cell cell1 = row.createCell(4);
			cell1.setCellValue("Food Recommendation for " + DiseaseEntity.getDiseaseName());

			Row header = sheet.createRow(3);

			Cell vegtableHeader = header.createCell(1);
			vegtableHeader.setCellValue("Vegtable");
			

			Cell fruitHeader = header.createCell(2);
			fruitHeader.setCellValue("Fruits");

			Cell foodHeader = header.createCell(3);
			foodHeader.setCellValue("Food");
			List<RecommendationEntity> foodRecommendationList = dao.foodRecommendationList(foodRecommendation);
			int rowCount = 4;
			for (RecommendationEntity RecommendationEntity : foodRecommendationList) {
				Row data = sheet.createRow(rowCount);

				Cell vegtableData = data.createCell(1);
				vegtableData.setCellValue(RecommendationEntity.getVegetables());

				Cell fruitData = data.createCell(2);
				fruitData.setCellValue(RecommendationEntity.getFruits());

				Cell foodData = data.createCell(3);
				foodData.setCellValue(RecommendationEntity.getFood());
				rowCount = rowCount + 1;

			}
			workBook.write(outStrem);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ByteArrayInputStream(outStrem.toByteArray());
	}

}
