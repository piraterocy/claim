package com.kb.claim.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kb.claim.service.ClaimService;

@RestController
public class ClaimController {
	@Autowired
	private ClaimService claimService;

	@Autowired
	private HttpServletRequest request;

	@ResponseBody
	@RequestMapping(value = "/claims/{id}", method = { RequestMethod.GET})
	public Map<String, Object> getStudentById(@PathVariable("id") String id) {
		//Map<String, String> map = getHeadersInfo();
		//System.out.println(map);
		return claimService.getClaimById(id);

	}

	/*
	// get user agent
	private String getUserAgent() {
		return request.getHeader("user-agent");
	}

	// get request headers
	private Map<String, String> getHeadersInfo() {
		Map<String, String> map = new HashMap<String, String>();
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			String value = request.getHeader(key);
			map.put(key, value);
		}
		return map;
	}*/

}
