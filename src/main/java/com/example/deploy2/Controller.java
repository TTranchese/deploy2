package com.example.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
	//((Math.random() * (122 - 97)) + 97)
	@GetMapping
	public int randomSum() {
		return (int)(((Math.random() * (100 - 1)) + 1)+((Math.random() * (100 - 1)) + 1));
	}
}
