package javashizhan.demo13.execdemo02;

import java.util.Iterator;

public class execdemo02 {
	public static void main(String[] args) {
		Course c1 = new Course("英语",3);//实例化课程对象
		Course c2 = new Course("计算机",5);//实例化课程对象
		
		Student s1 = new Student("张三",20);//实例化学生对象
		Student s2 = new Student("张四",21);//实例化学生对象
		Student s3 = new Student("张五",22);//实例化学生对象
		Student s4 = new Student("张六",23);//实例化学生对象
		Student s5 = new Student("张七",24);//实例化学生对象
		Student s6 = new Student("张八",25);//实例化学生对象
		//第一门课程有3个人参加，向课程中增加3个学生信息，同时向学生中增加课程信息
		c1.getAllStudents().add(s1);
		c1.getAllStudents().add(s2);
		c1.getAllStudents().add(s6);
		
		s1.getAllCourses().add(c1);
		s2.getAllCourses().add(c1);
		s6.getAllCourses().add(c1);
		//第二门课程有6个人参加，向课程中增加6个学生信息，同时向学生中增加课程信息
		c2.getAllStudents().add(s1);
		c2.getAllStudents().add(s2);
		c2.getAllStudents().add(s3);
		c2.getAllStudents().add(s4);
		c2.getAllStudents().add(s5);
		c2.getAllStudents().add(s6);
		
		s1.getAllCourses().add(c2);
		s2.getAllCourses().add(c2);
		s3.getAllCourses().add(c2);
		s4.getAllCourses().add(c2);
		s5.getAllCourses().add(c2);
		s6.getAllCourses().add(c2);
		
		//输出一门课程的信息，观察有多少学生参加
		System.out.println(c1);
		Iterator<Student> iter = c1.getAllStudents().iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println("\t|-"+s);//输出学生信息
		}
		
		//输出一个学生参加的课程信息，观察有多少课程
		System.out.println(s6);
		Iterator<Course> iter1 = s6.getAllCourses().iterator();//getAllCourses()获取全部课程，返回List对象
		while (iter1.hasNext()) {
			Course c = iter1.next();
			System.out.println("\t|-"+c);
		}
		
		
		
	}
}
