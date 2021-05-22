package com.menrva.healthapp.controller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@GetMapping("/healthCheck")
	public String check()
	{
		return "checked";
	}	
	
}
