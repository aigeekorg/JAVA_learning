package javashizhan.demo12.person_info_manager;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){//��дtoString����
		return "������"+this.name+"�����䣺"+this.age;		
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
	
}
