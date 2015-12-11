package javashizhan;
//对象比较，重要
public class test5_48 {
	public static void main(String[] args) {
		Person2 per1 = new Person2("张三",33);//调用有参构造
		Person2 per2 = new Person2("张三",33);//调用有参构造
		if(per1.compare(per2))
			System.out.println("两对象相等");
		else
			System.out.println("两对象不相等");
	}

}
class Person2{
	private String name;
	private int age;
	public Person2(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public boolean compare(Person2 per){
		Person2 p1 =this;
		Person2 p2 = per;
		if(p1 == p2){
			System.out.println("对象完全相同");
			return true;
			}
		else
			System.out.println("p1="+p1+",p2="+p2);
		
		if(p1.name.equals(p2.name)&&p1.age==p2.age){
			System.out.println("name:"+name);
			System.out.println("age:"+age);
			return true;//两个对象相等
		}else{
			return false;
		}		
	}
	public String getInfo(){
		return "姓名："+name+"，年龄，"+age;
		
	}
}
