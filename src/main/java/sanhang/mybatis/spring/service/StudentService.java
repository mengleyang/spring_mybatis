package sanhang.mybatis.spring.service;

import sanhang.mybatis.spring.model.Student;

public interface StudentService {
	
	Student getStudent(String studentId);
	
	void saveStudent(Student student);

}
