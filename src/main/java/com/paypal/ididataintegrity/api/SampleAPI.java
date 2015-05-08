package com.paypal.ididataintegrity.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.paypal.ididataintegrity.entity.SampleEntity;

public interface SampleAPI {
	
	@GET
	@Path("sample")
	@Produces("application/json")
	public SampleEntity read();
}
