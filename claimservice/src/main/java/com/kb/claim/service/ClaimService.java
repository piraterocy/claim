package com.kb.claim.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kb.claim.mapper.now.TestMapper;
import com.kb.claim.mapper.old.ClaimMapper;
import com.kb.claim.model.ClaimBean;
import com.kb.claim.model.TestBean;

@Service
public class ClaimService {
	@Autowired
	private ClaimMapper claimDao;
	
	@Autowired
	private TestMapper testDao;

	public Map<String, Object> getClaimById(String id) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		// StudentDao dao=SpringUtil.getStudentDao();
		ClaimBean doc = claimDao.findById(id);
		
		System.out.println("-----------------------");
		TestBean test = testDao.findById(id);
		
		result.put("success", true);
		result.put("message", test);
		return result;
	}
}
