package org.acme.repository;

import org.acme.entity.Provider;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ProviderRepository implements PanacheRepository<Provider>{

	
}
