package com.example.springs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springs.entity.Student;
import com.example.springs.repository.StudentRepository;

import org.springframework.web.bind.annotation.RequestBody;

@RestController

public class HomeController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/")
	public String index() {
		return "hello!!";
	}
	
	// for create record
	@PostMapping("/saveStudent")
	public Student saveData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	
	// for read
	@GetMapping("/getAllStudent")
	public List<Student> getAll(){
		List<Student> studentList = studentRepository.findAll();
		return studentList;
	}
	
	//for delete
	@DeleteMapping("/deleteStudent/{RollNo}")
	public String deleteStudent(@PathVariable int RollNo) {
		Student student = studentRepository.findById(RollNo).get();
		if(student!=null)
			studentRepository.delete(student);
		return "Value Deleted";
	}
	
	//for update
	@PutMapping("/updateData")
	public Student updateStudentData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
}
