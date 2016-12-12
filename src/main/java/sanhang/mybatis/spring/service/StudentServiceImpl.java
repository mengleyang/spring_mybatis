package sanhang.mybatis.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sanhang.mybatis.spring.mapper.StudentMapper;
import sanhang.mybatis.spring.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;

	public Student getStudent(String studentId) {
		return this.studentMapper.getStudentById(studentId);
	}

	public void saveStudent(Student student) {
		this.studentMapper.save(student);
	}
}
