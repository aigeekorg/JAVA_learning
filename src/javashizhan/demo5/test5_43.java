package javashizhan.demo5;

public class test5_43 {
	public static void main(String[] args) {
		Person per1 = new Person("张三",33);//调用有参构造
		System.out.println(per1.getInfo());//调出信息
	}

}
class Person{
	private String name;
	private int age;
	public Person(){
		System.out.println("一个新的Person对象被实例化");
	}
	public Person(String name, int age){
//		this();
		this.name = name;
		this.age = age;
	}
	public String getInfo(){
		return "姓名："+name+"，年龄，"+age;
		
	}
}
