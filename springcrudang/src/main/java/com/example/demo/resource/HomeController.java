package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.service.IStudentService;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {
@Autowired
private IStudentService iStudentService;

@PostMapping("/add")
public ResponseEntity<Long> saveTodb(@RequestBody StudentModel model){
	Long id = iStudentService.saveToDb(model);
	return ResponseEntity.ok(id);
}
@GetMapping("/all")
public ResponseEntity<List<StudentModel>> getAll(){ 
     return ResponseEntity.ok( iStudentService.getAll());
     
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<String> delete(@PathVariable Long id){
	   iStudentService.delete(id);
	   return new ResponseEntity<String>(HttpStatus.OK);
	   
}

@PutMapping("/edit")
public ResponseEntity<StudentModel> edit(@RequestBody StudentModel model){
	iStudentService.edit(model);
	return ResponseEntity.ok(model);
}
}
