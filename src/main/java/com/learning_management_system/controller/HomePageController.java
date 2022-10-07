package com.learning_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learning_management_system.DTO.TrainerDto;
import com.learning_management_system.entity.Trainer;

@Controller
public class HomePageController {

	@Autowired
	private TrainerDto trainerDTO;

	@GetMapping("intructor")
	public String instructorHome(Model model) {
		List<Trainer> trainers = trainerDTO.getTrainers();
		model.addAttribute("trainers", trainers);
		System.out.println(trainers);
		return "instructor-home";
	}
	
	@GetMapping("add-instructor")
	public String showInsertInstructorPage() {
		return "add-instructor";
	}
}
