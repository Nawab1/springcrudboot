package com.example.demo.service;

import java.util.List;

import com.example.demo.model.StudentModel;

public interface IStudentService {
 public Long saveToDb(StudentModel st);
 
public List<StudentModel> getAll();
public void delete(Long id) ;
public StudentModel edit(StudentModel model);

}
