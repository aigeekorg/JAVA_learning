package javashizhan.demo13.setdemo;

import java.util.HashSet;
import java.util.Set;


public class RepeatDemo02 {
	public static void main(String[] args) {
		//HashSet不需要Person1类实现Comparable接口，不需要按顺序输出
		Set<Person1> allSet = new HashSet<Person1>();
		allSet.add(new Person1("张三", 30));
		allSet.add(new Person1("张四", 31));
		allSet.add(new Person1("张五", 32));
		allSet.add(new Person1("张六", 32));
		allSet.add(new Person1("张七", 32));
		allSet.add(new Person1("张八", 32));
		allSet.add(new Person1("张九", 33));
		System.out.println(allSet);
	}
}


class Person1{
	private String name;
	private int age;
	public Person1(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Person1)){//传进来的不是本类的对象
			return false;
		}
		Person1 p = (Person1)obj;
		if(this.name.equals(p.name)&&this.age == p.age){
			return true;
		}else{
			return false;
		}
	}
	
	public int hashCode() {
		return this.name.hashCode()*this.age;
	}
	public String toString() {//覆写toString方法
		return "【姓名:"+this.name+"，年龄："+this.age+"】";
	}
}


