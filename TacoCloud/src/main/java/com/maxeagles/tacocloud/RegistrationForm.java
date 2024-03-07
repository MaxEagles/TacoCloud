package com.maxeagles.tacocloud;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data
public class RegistrationForm {

	private final String username;
	private final String password;
	private final String fullname;
	private final String street;
	private final String city;
	private final String state;
	private final String zip;
	private final String phone;
	
	public MyUser toUser(PasswordEncoder passwordEncoder) {
		return new MyUser(
			username, passwordEncoder.encode(password),
			fullname, street, city, state, zip, phone);
	}
}
