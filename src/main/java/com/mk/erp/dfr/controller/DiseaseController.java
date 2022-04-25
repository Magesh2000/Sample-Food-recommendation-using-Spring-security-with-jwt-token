package com.mk.erp.dfr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mk.erp.dfr.common.ApiConstant;
import com.mk.erp.dfr.common.MessageConstant;
import com.mk.erp.dfr.dto.DiseaseDTO;
import com.mk.erp.dfr.dto.JSONResponse;
import com.mk.erp.dfr.service.DiseaseService;

@Controller
@RequestMapping(ApiConstant.REQUEST_MAPPING_PATH)
public class DiseaseController {

	@Autowired
	private DiseaseService service;
	
	@PostMapping(value = ApiConstant.DISEASE)
	public ResponseEntity<JSONResponse> diseaseList(HttpServletRequest request, @RequestBody DiseaseDTO diseaseDTO) {
		JSONResponse jsonResponse = new JSONResponse();

		List<DiseaseDTO> respone =service.diseaseList(diseaseDTO);

		jsonResponse.setResponseCode(MessageConstant.SUCCESS_CODE);
		jsonResponse.setResponseMessage(MessageConstant.SIGNUP_MESSAGE);
		jsonResponse.setSuccesObject(respone);
		

		return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
	}
	
}
