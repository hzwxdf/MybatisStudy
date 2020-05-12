package hzwxdf.com.domain;

import java.util.Date;

public class Student {
    private String s_id;     // id编号  
    private String s_name;   // 姓名
    private String s_sex;    // 性别
    private String s_age;    // 年龄
    private Date s_birthday; // 生日
    private String s_banji;  // 班级
  
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_sex() {
		return s_sex;
	}
	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
	}
	public String getS_age() {
		return s_age;
	}
	public void setS_age(String s_age) {
		this.s_age = s_age;
	}
	public Date getS_birthday() {
		return s_birthday;
	}
	public void setS_birthday(Date s_birthday) {
		this.s_birthday = s_birthday;
	}
	public String getS_banji() {
		return s_banji;
	}
	public void setS_banji(String s_banji) {
		this.s_banji = s_banji;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return s_id + "--" + s_name + "--" + s_age + "--" + s_birthday.toLocaleString();
	}
	
}
