package com.example.demo.controller;

import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Lead;

public class LeadRestClient {
	
	public Lead getLeadById(long id) {
		RestTemplate rest = new RestTemplate();
		Lead lead =rest.getForObject("http://localhost:9090/api/lead/get/"+id, Lead.class);
		return lead;
	}

}
