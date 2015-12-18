package javashizhan.demo13.mapdemo;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){//覆写toString方法
		return "姓名："+this.name+"：年龄"+this.age;
	}
}
