package com.gl.security.studentMgmtDebate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.security.studentMgmtDebate.Model.Student;

public interface StudentRepository extends JpaRepository <Student, Integer>{

}
