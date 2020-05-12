package hzwxdf.com.daoImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import hzwxdf.com.dao.Student2Dao;
import hzwxdf.com.domain.Student;

public class Student2DaoImp implements Student2Dao {
	
	private SqlSessionFactory sessionfactory;
	
	public Student2DaoImp(SqlSessionFactory factory) {
		// TODO 自动生成的构造函数存根
	    this.sessionfactory=factory;
	}

	@Override
	public void insertStudent(Student student) {
		// TODO 自动生成的方法存根
		SqlSession sqlsession = sessionfactory.openSession();
		int result = sqlsession.insert("Studnet2Dao.insertStudent", student);
		System.out.println("insert = " + result);
		sqlsession.commit();
		sqlsession.close();
	}

	@Override
	public void deleteStudent(String s_id) {
		// TODO 自动生成的方法存根
		SqlSession sqlsession = sessionfactory.openSession();
		int result = sqlsession.delete("Studnet2Dao.deleteStudent", s_id);
		System.out.println("delete = " + result);
		sqlsession.commit();
		sqlsession.close();
	}

	@Override
	public void updateStudent(Student student) {
		// TODO 自动生成的方法存根
		SqlSession sqlsession = sessionfactory.openSession();
		int result = sqlsession.delete("Studnet2Dao.updateStudent", student);
		System.out.println("update = " + result);
		sqlsession.commit();
		sqlsession.close();
	}

	@Override
	public Student findByColumn(String column, String value) {
		// TODO 自动生成的方法存根
		SqlSession sqlsession = sessionfactory.openSession();
		HashMap<String,String> map = new HashMap<>();
		map.put("column", column);
		map.put("value", value);
		Student s = sqlsession.selectOne("Studnet2Dao.findByColumn", map);
		System.out.println("select = " + s);
		sqlsession.commit();
		sqlsession.close();
		return s;
	}

	@Override
	public List<Student> findByName(String name) {
		// TODO 自动生成的方法存根
		SqlSession sqlSession = sessionfactory.openSession();
		List<Student> list = sqlSession.selectList("Studnet2Dao.findByName", name);
		for(Student s: list) {
			System.out.println("foreach = " + s);
		}
		return list;
	}

}
