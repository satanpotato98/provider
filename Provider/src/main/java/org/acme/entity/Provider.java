package org.acme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="provider")
public class Provider {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String decsriptio;
	String authentication;
	String authorize;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecsriptio() {
		return decsriptio;
	}
	public void setDecsriptio(String decsriptio) {
		this.decsriptio = decsriptio;
	}
	public String getAuthentication() {
		return authentication;
	}
	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}
	public String getAuthorize() {
		return authorize;
	}
	public void setAuthorize(String authorize) {
		this.authorize = authorize;
	}
	
	
	
	
}
