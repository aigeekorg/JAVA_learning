package javashizhan;

public class test5_43 {
	public static void main(String[] args) {
		Person per1 = new Person("����",33);//�����вι���
		System.out.println(per1.getInfo());//������Ϣ
	}

}
class Person{
	private String name;
	private int age;
	public Person(){
		System.out.println("һ���µ�Person����ʵ����");
	}
	public Person(String name, int age){
//		this();
		this.name = name;
		this.age = age;
	}
	public String getInfo(){
		return "������"+name+"�����䣬"+age;
		
	}
}
