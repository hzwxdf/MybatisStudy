package hzwxdf.com.test;

import java.io.IOException;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import hzwxdf.com.dao.StudentDao;
import hzwxdf.com.domain.Student;

public class StudentTest {

	@Test
	public void findAllTest() {
		try {
			// 读取mybatis-config配置文件
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			// 创建SqlSessionFactoryBuilder工厂类构建器
			SqlSessionFactoryBuilder sqlbuilder = new SqlSessionFactoryBuilder();
			// 创建SqlSessionFactory工厂类
			SqlSessionFactory sqlsessionfactory = sqlbuilder.build(in);
			// 创建SqlSession对象， SqlSession执行映射文件中定义的SQL，并返回映射结果
			SqlSession sqlsession = sqlsessionfactory.openSession();
			/*
			// 查询所有student
			List<Student> list = sqlsession.selectList("hzwxdf.com.dao.StudentDao.findAll");
			for(Student s : list) {
				System.out.println(s.toString());
			}
			
			Student s = new Student();
			s.setS_id("4");
			s.setS_age("20");
			s.setS_sex("男");
			s.setS_birthday(new Date());
			s.setS_banji("软件102");
			s.setS_name("jack");
			// 查询
			Student s1 = sqlsession.selectOne("hzwxdf.com.dao.StudentDao.selectStudentById", "2015001");
			System.out.println(s1.toString());
			
			// 插入
			sqlsession.insert("hzwxdf.com.dao.StudentDao.insertStudent", s);
			Student ss = s; 
			ss.setS_id("5");
			sqlsession.insert("hzwxdf.com.dao.StudentDao.insertStudent", ss);
			
			// 更新
			s.setS_name("JACK2.0");
			sqlsession.update("hzwxdf.com.dao.StudentDao.updateStudent", s);
			
			// 删除
			sqlsession.delete("hzwxdf.com.dao.StudentDao.deleteStudent", "5");
			
			// 查询所有student
			List<Student> list2 = sqlsession.selectList("hzwxdf.com.dao.StudentDao.findAll");
			for(Student s2 : list2) {
				System.out.println(s2.toString());
			}
			*/
			// 动态sql
			/*
			Student s3 = sqlsession.selectOne("hzwxdf.com.dao.StudentDao.findByName","学生A");
			System.out.println(s3.toString());
			
			Student s4 = sqlsession.selectOne("hzwxdf.com.dao.StudentDao.findByName2",null);
			System.out.println(s4.toString());
			Student s5 = sqlsession.selectOne("hzwxdf.com.dao.StudentDao.findByName2","学生B");
			System.out.println(s5.toString());
			
			Student s42 = sqlsession.selectOne("hzwxdf.com.dao.StudentDao.findByName2",null);
			System.out.println(s42.toString());
			Student s52 = sqlsession.selectOne("hzwxdf.com.dao.StudentDao.findByName2","学生B");
			System.out.println(s52.toString());
			
			List<Student> list6 = sqlsession.selectList("hzwxdf.com.dao.StudentDao.findByName3","学生");
			for(Student s : list6) {
				System.out.println(s.toString());
			}
			
			List<Student> list7 = sqlsession.selectList("hzwxdf.com.dao.StudentDao.findByName4", "2015");
			for(Student s : list7) {
				System.out.println(s.toString());
			}
			
            
			// 学习foreach的array
			// 使用面向对象编程方式，使用mapper
			String[] ids = new String[]{"2015001","2015002"};
			// 通过getMapper()方法获取对象
			StudentDao mapper = sqlsession.getMapper(StudentDao.class);
			// 调用对象的findByName5方法
			List<Student> list7 = mapper.findByName5(ids);
			for(Student s : list7) {
				System.out.println(s.toString());
			}
			
			// 学习foreach的list
			ArrayList<String> idlist= new ArrayList<>();
			idlist.add("2015001");
			idlist.add("2015003");
			// 通过getMapper()方法获取对象
			StudentDao mapper2 = sqlsession.getMapper(StudentDao.class);
			// 调用对象的findByName5方法
			List<Student> list8 = mapper2.findByName6(idlist);
			for(Student s : list8) {
				System.out.println(s.toString());
			}
			
			// 学习foreach的map
			HashMap<String,Object> map = new HashMap<>();
			map.put("name", "学生");
			String[] ids2 = new String[]{"2015001","2015002"};
			map.put("ids", ids2);
			StudentDao mapper3 = sqlsession.getMapper(StudentDao.class);
			List<Student> list9 = mapper3.findByName7(map);
			for(Student s : list9) {
				System.out.println(s.toString());
			}
			*/
			Student s = new Student();
			s.setS_id("100");
			s.setS_age("20");
			s.setS_sex("男");
			s.setS_birthday(new Date());
			s.setS_banji("软件102");
			s.setS_name("jack");
			StudentDao mapper = sqlsession.getMapper(StudentDao.class);
			mapper.insertStudentGetID(s);
			System.out.println(s);
			
			sqlsession.commit();
			sqlsession.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
