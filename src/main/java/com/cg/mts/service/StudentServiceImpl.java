package com.cg.mts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.dao.StudentDAO;
import com.cg.mts.entities.Student;


@Service
public class StudentServiceImpl implements StudentService{
	

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}

	@Override
	public Student addStudents(Student student) {
		// TODO Auto-generated method stub
		studentDAO.save(student);
		return student;
	
	}

	@Override
	public Student updateStudents(Student student) {
		// TODO Auto-generated method stub
		studentDAO.save(student);
		return student;
	}
	@Override
	public String deleteStudentById(int studentId)  {
		
		Optional<Student> student =studentDAO.findById(studentId);

		String message = null;
		
		if (student.isPresent()) {
			studentDAO.deleteById(studentId);
			
			message = new String("Student Record deleted successfully.");
		}else {
			
		}
		
		return message;
		
	}

	@Override
	public Student getStudentById(int student_id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
