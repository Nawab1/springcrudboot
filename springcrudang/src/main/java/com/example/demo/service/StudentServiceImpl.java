package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.NoSuchData;
import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Long saveToDb(StudentModel st) {
		st.setGst( Discount.stdis(st.getStudentCoursePrice()) );

		st =  studentRepository.save(st);
		return st.getsId();
	}
   
	public List<StudentModel> getAll(){
		return studentRepository.findAll();
	}
	
	public void delete(Long id) {
		Optional<StudentModel> o = studentRepository.findById(id);
		if(o.isEmpty())
			throw new NoSuchData("no item available "+id);
		studentRepository.deleteById(id);
	}
	
	public StudentModel edit(StudentModel model) {
		model.setGst( Discount.stdis(model.getStudentCoursePrice()) );

		model =  studentRepository.save(model);
	studentRepository.save(model);
	  return model;
	}
}
