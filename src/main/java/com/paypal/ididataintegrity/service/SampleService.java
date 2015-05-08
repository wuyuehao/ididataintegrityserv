package com.paypal.ididataintegrity.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.paypal.ididataintegrity.api.SampleAPI;
import com.paypal.ididataintegrity.entity.SampleEntity;

public class SampleService implements SampleAPI{

	@Autowired
	SampleEntity se;
	
	public SampleEntity read() {
		return se;
	}
	
}
