package javashizhan.demo13.execdemo01;

import java.util.Iterator;

public class TestDemo {
	public static void main(String[] args) {
		School sch = new School("清华大学");					//实例化学校对象
		Student s1 = new Student("张三",21);					//实例化学生对象
		Student s2 = new Student("李四",22);
		Student s3 = new Student("王五",23);
		
		sch.getAllStudents().add(s1);						//在学校中加入学生
		sch.getAllStudents().add(s2);
		sch.getAllStudents().add(s3);
		
		s1.setSchool(sch);									//一个学生属于一个学校
		s2.setSchool(sch);
		s3.setSchool(sch);
		
		
		System.out.println(sch);							//输出学校信息
		
		//实例化iterator对象，用于输出全部的学生信息
		Iterator<Student> iter = sch.getAllStudents().iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		
	}
}
