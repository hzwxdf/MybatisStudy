package hzwxdf.com.test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import hzwxdf.com.dao.Student3Mapper;
import hzwxdf.com.domain.Student;

public class Student3Test {
	
	/**
	 * 使用mapper动态开发
	 * @throws IOException 
	 */
	@Test
	public void test() throws IOException {
		// 1. 创建并实例化工厂构建器
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		// 2. 创建并实例化工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("mybatis-config.xml"));
		// 3. 创建并实例化sqlsession
		SqlSession sqlsession = factory.openSession();
		// 4. 获取对应mapper对象
		Student3Mapper mapper = sqlsession.getMapper(Student3Mapper.class);
		
		// 5. 调用对象的对应方法
		Student s = new Student();
		s.setS_id("12");
		s.setS_age("20");
		s.setS_sex("男");
		s.setS_birthday(new Date());
		s.setS_banji("软件102");
		s.setS_name("jack");
		//mapper.insertStudent(s);
		
		//mapper.deleteStudent("12");
		
		//s.setS_name("tom-cat");
		//mapper.updateStudent(s);
		
		//Student res = mapper.findByColumn("s_id", "2015001");
		//System.out.println(res);
		
		List<Student> list = mapper.findByName("学生");
		for (Student student : list) {
			System.out.println(student);
		}
		
		sqlsession.commit();
		sqlsession.close();
	}

}
