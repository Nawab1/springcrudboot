package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;
@Data
@Entity
public class StudentModel implements Serializable {
 private Long sId;
 private String studentName;
 private String studentCourse;
 private Double studentCoursePrice;
 private Double gst;
public Long getsId() {
	return sId;
}
public void setsId(Long sId) {
	this.sId = sId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCourse() {
	return studentCourse;
}
public void setStudentCourse(String studentCourse) {
	this.studentCourse = studentCourse;
}
public Double getStudentCoursePrice() {
	return studentCoursePrice;
}
public void setStudentCoursePrice(Double studentCoursePrice) {
	this.studentCoursePrice = studentCoursePrice;
}
public Double getGst() {
	return gst;
}
public void setGst(Double gst) {
	this.gst = gst;
}
public StudentModel() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
}
