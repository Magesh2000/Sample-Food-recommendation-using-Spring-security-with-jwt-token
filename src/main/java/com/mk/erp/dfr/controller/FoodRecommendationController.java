package com.mk.erp.dfr.controller;

import java.io.ByteArrayInputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.io.Resource;
import com.mk.erp.dfr.common.ApiConstant;
import com.mk.erp.dfr.common.MessageConstant;
import com.mk.erp.dfr.dto.JSONResponse;
import com.mk.erp.dfr.dto.RecommendationDTO;
import com.mk.erp.dfr.service.FoodRecommendationService;

@Controller
@RequestMapping(ApiConstant.REQUEST_MAPPING_PATH)
public class FoodRecommendationController {

	@Autowired
	private FoodRecommendationService service;

	@PostMapping(value = ApiConstant.FOOD_RECOMMENDATION)
	public ResponseEntity<JSONResponse> foodRecommendation(HttpServletRequest request,
			@RequestBody RecommendationDTO foodRecommendation) {
		JSONResponse jsonResponse = new JSONResponse();

		RecommendationDTO respone = service.foodRecommendation(foodRecommendation);

		jsonResponse.setResponseCode(MessageConstant.SUCCESS_CODE);
		jsonResponse.setResponseMessage(MessageConstant.SIGNUP_MESSAGE);
		jsonResponse.setSuccesObject(respone);

		return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
	}

	@PostMapping(value = ApiConstant.FOOD_RECOMMENDATION_PDF)
	public ResponseEntity<InputStreamResource> foodRecommendationPdf(HttpServletRequest request,
			@RequestBody RecommendationDTO foodRecommendation) {

		ByteArrayInputStream generatePdf = service.foodRecommendationPdf(foodRecommendation);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=Food Recommendation.pdf");

		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(generatePdf));
	}

	@PostMapping(value = ApiConstant.FOOD_RECOMMENDATION_EXCEL)
	public ResponseEntity<Resource> foodRecommendationExcel(HttpServletRequest request,
			@RequestBody RecommendationDTO foodRecommendation) {

		ByteArrayInputStream generateExcel = service.foodRecommendationExcel(foodRecommendation);

		InputStreamResource file = new InputStreamResource(generateExcel);

		return ResponseEntity .ok()
			    .contentType(MediaType.APPLICATION_OCTET_STREAM)
			    .header(HttpHeaders.CONTENT_DISPOSITION, "inline;filename=\"myfilename.xls\"")
			    .body(file);
	}
}
