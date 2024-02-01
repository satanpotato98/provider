package org.acme.controller;

import org.acme.entity.ProviderDTO;
import org.acme.service.ProviderServiceInterface;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/add")
public class ProviderController {
	
	@Inject
	ProviderServiceInterface con;
	
	@POST
	public String add(ProviderDTO dto) {
		
		return(con.addProvider(dto));
	}
	

}
