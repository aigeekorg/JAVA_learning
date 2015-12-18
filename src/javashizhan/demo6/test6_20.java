package javashizhan.demo6;

abstract class A{
	public static final String FLAG = "CHINA";
	private String name = "yaokun";
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public abstract void print();//定义抽象方法
	public abstract void print1();//定义抽象方法
	
}

class B extends A{
	public void print(){
		System.out.println("FLAG="+FLAG);
		System.out.println("姓名 = "+super.getName());
	}
	
	public void print1(){
		System.out.println("DO NOTHING，测试一下p196的提示，我只是第二个抽象方法O(∩_∩)O~");
	}

}

public class test6_20 {
	public static void main(String[] args) {
		B b = new B();//实例化子类对象
		b.print();//调用被子类覆写过的方法
		b.print1();
	}
}