package javashizhan.demo13.execdemo02;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private int credit;
	private List<Student> allStudents;
	public Course(){
		this.allStudents = new ArrayList<Student>();//实例化List集合
	}
	public Course(String name,int credit){
		this();
		this.setName(name);
		this.setCredit(credit);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public List<Student> getAllStudents() {   					//获取全部学生，返回List对象
		return allStudents;
	}
	public void setAllStudents(List<Student> allStudents) {		//设置全部学生
		this.allStudents = allStudents;
	}
	
	
	public String toString() {
		return "课程名称："+this.name+"；课程学分："+this.credit;
	}
}
