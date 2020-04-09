package com.nayak.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nayak.model.Friends;

@RestController
public class TestController {

	@GetMapping("/friends")
	public ResponseEntity<List<Friends>> getRating() {
		Friends f1 = new Friends("Raj Kumar", "Raj");
		Friends f2 = new Friends("Ram Kumar", "Ram");
		Friends f3 = new Friends("Remo Kumar", "Remo");
		List<Friends> list = Arrays.asList(f1, f2, f3);
		return new ResponseEntity<List<Friends>>(list, HttpStatus.OK);
	}
}
