package com.paypal.ididataintegrity.entity;

import org.springframework.stereotype.Component;

@Component
public class SampleEntity {
	private String name = "Default";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
