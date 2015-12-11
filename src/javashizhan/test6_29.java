package javashizhan;

class A1{
	public void fun1(){
		System.out.println("A-->public void fun1(){}");
	}
	public void fun2(){
		this.fun1();
	}
}

class B1 extends A1{
	public void fun1(){
		System.out.println("B-->public void fun1(){}");
	}
	public void fun3(){
		System.out.println("B-->public void fun3(){}");
	}
}

public class test6_29 {
	public static void main(String[] args) {
		A1 a = new B1();//向上转型，父类引用指向子类对象
		B1 b = (B1)a;//把指向子类对象的父类引用赋给子类引用
		b.fun1();//调用子类方法，已被覆写的方法
		b.fun2();//调用父类方法，但该fun1()已被覆写
		b.fun3();//调用子类自己定义的方法
		System.out.println(b instanceof A1);
		System.out.println(b instanceof B1);
		System.out.println(a instanceof A1);
		System.out.println(a instanceof B1);
		A1 a1 = new A1();
		System.out.println(a1 instanceof A1);
		System.out.println(a1 instanceof B1);
	}
}