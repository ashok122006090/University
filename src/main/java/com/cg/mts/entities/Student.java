package com.cg.mts.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
@Entity
@Table(name="Student")
public class Student {
   
   @Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
  // @Column(name="doctor_id")
	private int Studentid;
  
  
    String StudentName;
  
   int english_marks;
   int maths_marks;
   int science_marks;

	Student(){
		
	}

	public Student(int studentid, String studentName, int english_marks, int maths_marks, int science_marks) {
		super();
		Studentid = studentid;
		StudentName = studentName;
		this.english_marks = english_marks;
		this.maths_marks = maths_marks;
		this.science_marks = science_marks;
	}

	public int getStudentid() {
		return Studentid;
	}

	public void setStudentid(int studentid) {
		Studentid = studentid;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getEnglish_marks() {
		return english_marks;
	}

	public void setEnglish_marks(int english_marks) {
		this.english_marks = english_marks;
	}

	public int getMaths_marks() {
		return maths_marks;
	}

	public void setMaths_marks(int maths_marks) {
		this.maths_marks = maths_marks;
	}

	public int getScience_marks() {
		return science_marks;
	}

	public void setScience_marks(int science_marks) {
		this.science_marks = science_marks;
	}
	
	
}
