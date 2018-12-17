package com.security.basic.basicoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path = "/")
	public String getHome() {
		return "Home";
	}

	@GetMapping(path = "/private")
	public String getPrivate() {
		return "Private";
	}
}
