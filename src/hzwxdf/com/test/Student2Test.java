package hzwxdf.com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import hzwxdf.com.daoImp.Student2DaoImp;
import hzwxdf.com.domain.Student;

public class Student2Test {
	
	@Test
	public void Test() throws IOException {
		Student s = new Student();
		s.setS_id("10");
		s.setS_age("20");
		s.setS_sex("男");
		s.setS_birthday(new Date());
		s.setS_banji("软件102");
		s.setS_name("jack");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = builder.build(in);
		
		Student2DaoImp daoimp = new Student2DaoImp(factory);
		
		//daoimp.insertStudent(s);
		
		//daoimp.deleteStudent("10");
		
		//s.setS_name("tom");
		//daoimp.updateStudent(s);
		
		//daoimp.findByColumn("s_id", "2015001");
		//daoimp.findByColumn("s_name", "学生C");
		
		daoimp.findByName("学生");
		
	}

}
