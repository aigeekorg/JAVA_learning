package javashizhan;

class Person1{
	private String name;
	private int age;
	public Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "姓名："+this.name+"；年龄："+this.age;
	}
}

class Person11{}

public class test6_45 {
	public static void main(String[] args) {
		Person1 per = new Person1("姚坤",26);
		System.out.println("per对象信息："+per);
		Person11 per11 = new Person11();
		System.out.println("per11对象信息："+per11);
		System.out.println("per11对象信息："+per11.toString());
	}
}
