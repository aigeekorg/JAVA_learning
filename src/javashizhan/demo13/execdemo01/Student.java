package javashizhan.demo13.execdemo01;

public class Student {
	private String name;
	private int age;
	private School school;
	
	public Student(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "学生姓名："+this.name+";年龄："+this.age;
	}
	
}
