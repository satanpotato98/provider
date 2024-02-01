package org.acme.entity;

public class ProviderDTO {

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
	public ProviderDTO(Long id, String name, String decsriptio, String authentication, String authorize) {
		super();
		this.id = id;
		this.name = name;
		this.decsriptio = decsriptio;
		this.authentication = authentication;
		this.authorize = authorize;
	}
	public ProviderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
