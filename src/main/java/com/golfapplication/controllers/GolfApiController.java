package com.golfapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.golfapplication.models.GolfCourse;
import com.golfapplication.repositories.GolfCourseRepository;

@RestController
public class GolfApiController {
	
	@Autowired
	GolfCourseRepository golfCourseRepository;
	
	@GetMapping("/saveCourse")
	public GolfCourse addACourse(String courseName) {
		GolfCourse gc = new GolfCourse();
		gc.setCourseName(courseName);
		return golfCourseRepository.save(gc);	
	}
	

}
