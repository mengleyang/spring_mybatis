package sanhang.mybatis.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import sanhang.mybatis.spring.model.Student;

public interface StudentMapper {

	@Select("select * from student where id = #{studentId}")
	Student getStudentById(@Param("studentId") String studentId);
	
	@Insert("insert into student(name) values(#{name})")  
	//@Options(useGeneratedKeys = true, keyProperty = "student.id")
	@SelectKey(statement = "select last_insert_id() as id", keyProperty = "id", keyColumn = "id", before = false, resultType = Integer.class) 
    public void save(Student student);
	
	@Delete("delete from student where id = #{id}")  
    public int deleteById(int id);  
      
    @Update("update student set name = #{name} where id = #{id}")  
    public int update(Student student);  
      
    @Select("select * from student")  
    public List<Student> getAllStudents(); 
}
