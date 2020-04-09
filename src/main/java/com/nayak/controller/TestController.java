package com.nayak.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nayak.model.Friends;

@RestController
public class TestController {

	int counter = 0;
	
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private Environment env;

	@GetMapping("/friends")
	public ResponseEntity<List<Friends>> getRating() {
		Friends f1 = new Friends("Raj Kumar", "Raj");
		Friends f2 = new Friends("Ram Kumar", "Ram");
		Friends f3 = new Friends("Remo Kumar", "Remo");
		List<Friends> list = Arrays.asList(f1, f2, f3);
		return new ResponseEntity<List<Friends>>(list, HttpStatus.OK);
	}

	@GetMapping("/counter")
	public String getCounter() {
		logger.info("Counter "+counter);
		return "" + counter++;
	}
	
	@GetMapping("/port")
	public String getPort() {
		logger.info("Port "+env.getProperty("local.server.port"));
		return "it is runing on "+(env.getProperty("local.server.port"));
	}
}
