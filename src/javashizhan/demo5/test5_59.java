package javashizhan.demo5;
class Demo0{
	public Demo0(){
		System.out.println("2.定义构造方法");
	}
	{
		System.out.println("0.构造块");
	}
	static{
		System.out.println("1.静态代码块");
	}
}
public class test5_59 {
	static{
		System.out.println("在主方法所在的类中定义的静态代码块");
	}
	public static void main(String[] args) {
		new Demo0();//实例化对象
		new Demo0();//实例化对象
		new Demo0();//实例化对象
	}
}
