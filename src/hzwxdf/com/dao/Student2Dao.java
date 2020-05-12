package hzwxdf.com.dao;

import java.util.List;

import hzwxdf.com.domain.Student;

public interface Student2Dao {

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
	Student findByColumn(String column, String value);
	
	/** 通过名字来模糊查询学生
	 * @param name
	 * @return
	 */
	List<Student> findByName(String name);
}
