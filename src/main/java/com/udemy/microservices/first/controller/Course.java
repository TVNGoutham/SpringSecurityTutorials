package com.udemy.microservices.first.controller;

public class Course {

	private String name;
	private int chapterCount;

	public Course() {
		super();
	}

	public Course(String name, int chapterCount) {
		super();
		this.name = name;
		this.chapterCount = chapterCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChapterCount() {
		return chapterCount;
	}

	public void setChapterCount(int chapterCount) {
		this.chapterCount = chapterCount;
	}

}
