package com.golfapplication.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GolfCourse {
	
	private String courseName;
	private double courseDistance;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseDistance() {
		return courseDistance;
	}
	public void setCourseDistance(double courseDistance) {
		this.courseDistance = courseDistance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


}
