package com.udemy.microservices.first.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllerClass {

	@Value("${dafault.course.name}")
	private String cName;
	
	@Value("${default.course.chapterCount}")
	private int cCount;
	
	@RequestMapping(value = "/default/course", method = RequestMethod.GET)
	public Course getDuplicateEndPoint(@RequestParam(value="name", defaultValue = "Spring Boot", required = false) String name,
			@RequestParam(value="chapterCount", defaultValue = "102634", required = false) int chapterCount)
	{
		return new Course(cName, cCount);
	}
	
	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public Course getEndPoint(@RequestParam(value="name", defaultValue = "Spring Boot", required = false) String name,
			@RequestParam(value="chapterCount", defaultValue = "102634", required = false) int chapterCount)
	{
		return new Course(name, chapterCount);
	}
	
	@RequestMapping(value = "/register/course", method = RequestMethod.POST)
	public String saveCourse(@RequestBody Course course)
	{
		return "Your course named "+course.getName()+" with "+course.getChapterCount()+" chapters saved successfully.";
	}
}
