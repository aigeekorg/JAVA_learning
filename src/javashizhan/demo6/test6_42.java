package javashizhan.demo6;

//在一个抽象类中有接口，在该抽象类被继承时接口的处理问题测试

abstract class A2{
	public abstract void printA();
	interface B{
		public void printB();
	}
	abstract class C{
		public abstract void printC();//定义抽象方法必须加上abstract关键词，否则就是一个普通方法，需要方法体{}
	}
}

class X extends A2{
	public void printA(){
		System.out.println("HELLO-->A");
	}
	
	/*	这里被屏蔽也不会报错，屏蔽是为了说明继承抽象类的子类只需实现直属于抽象类的抽象方法，
	 * 而不用实现该抽象类内部的接口和抽象类中的抽象方法
	class Y implements B{
		public void printB(){
			System.out.println("HELLO-->B");
		}
	}
	 */
	/*	
	class Z extends C{
		public void printC(){
			System.out.println("HELLO-->C");
		}
	}
	*/
}

public class test6_42 {
	public static void main(String[] args) {
/* 		X x = new A2();//报错！不能实例化A2，因为这类似于向下转型，由于x没有先向上转型，所以这里会发生错误
*/		
		A2 a = new X();//向上转型，父类引用指向子类对象
		a.printA();
/*
		X x = (X)a;//这时便可以进行向下转型，因为a已经进行向上转型处理了
*/		

/*
 		A2.B b = new X().new Y();
		b.printB();//调用被覆写方法
 */

/*
		A2.C c = new X().new Z();
		c.printC();//调用被覆写方法
*/
	}
}
