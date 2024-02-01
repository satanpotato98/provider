package org.acme.service;

import org.acme.entity.Provider;
import org.acme.entity.ProviderDTO;
import org.acme.repository.ProviderRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class ProviderService implements ProviderServiceInterface{
	
	@Inject
	ProviderRepository providerRepository;
	
	
	@Override @Transactional
	public String addProvider(ProviderDTO dto) {
		Provider p =new Provider();
		p.setName(dto.getName());
		p.setDecsriptio(dto.getDecsriptio());
		p.setAuthentication(dto.getAuthentication());
		p.setAuthorize(dto.getAuthorize());
		
		providerRepository.persistAndFlush(p);
		
		return("record saved");
		
		
		
	}

}
