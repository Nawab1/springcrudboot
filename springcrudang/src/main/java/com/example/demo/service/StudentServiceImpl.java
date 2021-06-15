package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements IStudentService {
   @Autowired
   private StudentRepository studentRepository;
	@Override
	public Long saveToDb(StudentModel st) {
	   st.setGst( Discount.stdis(st.getGst()) );
	  st =  studentRepository.save(st);
		return st.getsId();
	}

}
