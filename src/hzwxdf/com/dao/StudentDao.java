package hzwxdf.com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import hzwxdf.com.domain.Student;

/**
 * @author hzwxdf
 *
 */
public interface StudentDao {
	
	/** 查找所有student
	 * @return student的list集合
	 */
	List<Student> findAll();
	
	/** 通过id查询student
	 * @param id
	 * @return 指定student
	 */
	Student selectStudentById(String s_id);
	
	/** 通过student对象查询一条数据
	 * @param s
	 */
	void insertStudent(Student s);
	
	/**　通过student对象更新对应数据
	 * @param s
	 */
	void updateStudent(Student s);
	
	/** 通过id删除一条student记录
	 * @param id
	 */
	void deleteStudent(String s_id);
	
	/** 通过name查询数据
	 * if 学习
	 * @param name
	 * @return
	 */
	Student findByName(String name);
	
	/** 通过name查询数据
	 * where if 学习
	 * @param name
	 * @return
	 */
	Student findByName2(String name);
	
	/** 通过name查询数据
	 * ifelse=> choose-when-otherwise学习
	 * @param name
	 * @return
	 */
	Student findByName22(String name);
	
	/** 通过name进行模糊查询
	 * ${}学习
	 * @param name
	 * @return
	 */
	List<Student> findByName3(String name);
	
	/** 根据id进行模糊查询，
	 * 主要学习${}使用基本数据类型时，必须使用${value}，但是我现在测试不需要value也可以(2020-5-11)
	 * @param s_id
	 * @return
	 */
	List<Student> findByName4(String id);
	
	/** 通过name进行查询
	 * foreach学习-array
	 * @param name
	 * @return
	 */
	List<Student> findByName5(String[] ids);
	
	/** 通过name进行查询
	 * foreach学习-list
	 * @param ids
	 * @return
	 */
	List<Student> findByName6(List<String> ids);
	
	/** 通过name进行查询
	 * foreach学习-map
	 * @param name
	 * @param ids
	 * @return
	 */
	List<Student> findByName7(Map<String,Object> map);
	
	/** 插入用户时通过SELECT LAST_INSERT_ID()获取自增的id
	 * mysql获取自增id
	 * @param user
	 */
	void insertStudentGetID(Student user);
}
