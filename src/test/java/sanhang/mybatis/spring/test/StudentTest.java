package sanhang.mybatis.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import sanhang.mybatis.spring.model.Student;
import sanhang.mybatis.spring.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
public class StudentTest {
	
	@Autowired
	StudentService service;
	
	@Test  
    public void testStudent(){       
         Student student = service.getStudent("2"); 
         System.out.println(student.getName());
         Student stud = new Student();
         stud.setName("");
         service.saveStudent(stud);
         System.out.println(stud.getId());
    }  

}
