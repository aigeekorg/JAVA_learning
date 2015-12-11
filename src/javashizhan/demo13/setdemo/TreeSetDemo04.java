package javashizhan.demo13.setdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo04 {
	public static void main(String[] args) {
		Set<Person> allSet = new TreeSet<Person>();
		allSet.add(new Person("张三", 30));
		allSet.add(new Person("张四", 31));
		allSet.add(new Person("张五", 32));
		allSet.add(new Person("张六", 32));
		allSet.add(new Person("张七", 32));
		allSet.add(new Person("张八", 32));
		allSet.add(new Person("张九", 33));
		System.out.println(allSet);
	}
}

	//TreeSet中的元素都是有序存放，每一个对象必须制定好排序规则，
	//且TreeSet中的每个对象所在的类必须实现Comparable接口侧可以正常使用
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public 	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "姓名："+this.name+"；年龄："+this.age;
	}
	public int compareTo(Person per) {
		if(this.age > per.age){
			return 1;
		}else if (this.age < per.age) {
			return -1;
		}else {
			return this.name.compareTo(per.name);
		}
	}
}