package com.gl.security.studentMgmtDebate.Service;

import java.util.List;

import com.gl.security.studentMgmtDebate.Model.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(int id);

	public void save(Student student);

	public void deleteById(int id);

}
