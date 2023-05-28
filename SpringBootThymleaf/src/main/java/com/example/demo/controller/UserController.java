package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class UserController {

	@GetMapping("/register")
	public String register_form(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		List<String> professionList = Arrays.asList("Developer", "Designer", "Architecher");
		model.addAttribute("professionList", professionList);
		return "register_form.html";
	}
	
	@PostMapping("/register")
	public String register_submit(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "register_success.html";
	}
 }
