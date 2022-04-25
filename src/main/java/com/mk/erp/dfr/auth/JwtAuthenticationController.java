package com.mk.erp.dfr.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mk.erp.dfr.config.JwtTokenUtil;
import com.mk.erp.dfr.dto.JSONResponse;
import com.mk.erp.dfr.dto.JwtLoginRequest;

@RestController
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtLoginRequest authenticationRequest)
			throws Exception {
		JSONResponse response = new JSONResponse();
		response.setResponseCode(401);
		response.setResponseMessage("Invalid username or password. Please try again.");
		response.setSuccesObject(null);
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUsername(), authenticationRequest.getPassword()));
			final UserDetails userDetails = jwtInMemoryUserDetailsService
					.loadUserByUsername(authenticationRequest.getUsername());

			String token = jwtTokenUtil.generateToken(userDetails);
			response.setResponseCode(200);
			response.setResponseMessage("Token"+" :  " + token);
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			e.printStackTrace();
		}

		return ResponseEntity.ok(response);
	}

}
