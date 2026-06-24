package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Home;
import com.example.demo.repository.HomeRepository;

@Service

public class HomeServiceImpl implements HomeService {
	
	@Autowired
	private HomeRepository sr;
	

	@Override
	public void add(Home s) {
		// TODO Auto-generated method stub
		sr.save(s);

	}

	@Override
	public List<Home> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void addAll(List<Home> s) {
		// TODO Auto-generated method stub
		
		sr.saveAll(s);
		
	}

}
