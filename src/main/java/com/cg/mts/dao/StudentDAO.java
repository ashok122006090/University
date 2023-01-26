package com.cg.mts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.mts.entities.Student;


public interface StudentDAO extends JpaRepository<Student, Integer >{

}
