package com.cg.mts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.mts.entities.Student;

@Service
public interface StudentService {
	public List<Student> getStudents();
	public Student addStudents(Student student) ;
    public Student updateStudents(Student student);
	public String deleteStudentById(int student_Id);
	public Student getStudentById(int student_id);
 

}
