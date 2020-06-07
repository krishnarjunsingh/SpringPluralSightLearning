package com.pluralSight.learning.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingConrtoller {
	
	@GetMapping("greeting")
	public String greeting(Map<String, Object> model) {
		model.put("message", "hello Krishnarjun");
		return "greeting";
	}

}
