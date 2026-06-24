package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Home;
import com.example.demo.service.HomeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService ss;
	
	@GetMapping("/display")
	public List<Home> displayHomes(){
		return ss.display();
	}

	@PostMapping("/add")
	public void addHome(Home s) {
		ss.add(s);
	}
	
	@PostMapping("/addAll")
	public void addAllHome(@RequestBody List <Home> s) {
		ss.addAll(s);
	}
}
