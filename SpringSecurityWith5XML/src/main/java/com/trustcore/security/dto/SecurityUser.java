package com.trustcore.security.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class SecurityUser extends User {

	public SecurityUser(String username, String password,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		
		// TODO Auto-generated constructor stub
	}
	private String photo;
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public SecurityUser(String username, String password,String photo,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		this.photo=photo;
		// TODO Auto-generated constructor stub
	}

}
