package com.cg.mts.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Student;
import com.cg.mts.service.StudentService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class StudentController {
	
   @Autowired
	private StudentService studentService;
	

   @GetMapping("/students/{student_id}")
	public Student getStudentById(@PathVariable int student_id) {
		return this.studentService.getStudentById(student_id);
	}
    
   @GetMapping("/students")
	public ResponseEntity<Student> getStudents(){
		List<Student> DoctorImpl = studentService.getStudents();
		return new ResponseEntity(DoctorImpl, HttpStatus.OK);
	}
	@PostMapping("/students")
	public ResponseEntity<Student> addStudents(@RequestBody Student studentDAO) {
		Student studentImpl = studentService.addStudents(studentDAO);
		return new ResponseEntity(studentImpl, HttpStatus.CREATED);
	}
	@PutMapping("/students")
	public ResponseEntity<Student> updateStudents(@RequestBody Student student) {
		Student studentImpl = studentService.updateStudents(student);
		return new ResponseEntity(studentImpl,HttpStatus.ACCEPTED);}
	
	@DeleteMapping("/student/{student_Id}")
	public void deleteStudentById(@PathVariable int student_Id) {
		this.studentService.deleteStudentById(student_Id);
		
	}
	

}
