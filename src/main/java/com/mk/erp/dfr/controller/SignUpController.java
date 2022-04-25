package com.mk.erp.dfr.controller;

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
import com.mk.erp.dfr.dto.JSONResponse;
import com.mk.erp.dfr.dto.UserDTO;
import com.mk.erp.dfr.service.SignupService;

@Controller
@RequestMapping(ApiConstant.REQUEST_MAPPING_PATH)
public class SignUpController {

		@Autowired
		private SignupService signupService;

		@PostMapping(value = ApiConstant.SIGN_UP)
		public ResponseEntity<JSONResponse> createUser(HttpServletRequest request, @RequestBody UserDTO userDTO)
				throws Exception {
			JSONResponse jsonResponse = new JSONResponse();

			signupService.createUser(userDTO);

			jsonResponse.setResponseCode(MessageConstant.SUCCESS_CODE);
			jsonResponse.setResponseMessage(MessageConstant.SIGNUP_MESSAGE);
			jsonResponse.setResponseMessage("Note: please confirm post method and ");
			jsonResponse.setSuccesObject("Please Sign Up link :" +"localhost:8081/dfr/authenticate");
			

			return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
		}

		

}
