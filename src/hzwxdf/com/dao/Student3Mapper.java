package hzwxdf.com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import hzwxdf.com.domain.Student;

public interface Student3Mapper {
	
	/** 插入学生
	 * @param student
	 */
	void insertStudent(Student student);
	
	/** 通过id删除学生
	 * @param s_id
	 */
	void deleteStudent(String s_id);
	
	/** 通过student对象更新对应数据
	 * @param student
	 */
	void updateStudent(Student student);
	
	/** 通过指定列和对应列的值来查找学生
	 * @param column  学生表中的字段
	 * @param value   学生表字段对应值
	 * @return
	 */
	//Student findByColumn(String column, String cvalue); //不使用注解会找不到column
	Student findByColumn(@Param("column") String column, @Param("cvalue") String cvalue);
	
	
	/** 通过名字来模糊查询学生
	 * @param name
	 * @return
	 */
	List<Student> findByName(String name);
}
