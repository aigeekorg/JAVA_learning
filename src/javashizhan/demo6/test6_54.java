package javashizhan.demo6;
//匿名内部类测试

interface AA{
	public void printInfo();
}

class XX{
	public void fun1(){
		this.fun2(new AA(){							//匿名内部类
			public void printInfo(){				//实现接口则必须覆写接口中的所有抽象方法
				System.out.println("Hello World!!!");
			}
		});
	}
	public void fun2(AA a){							//接收接口实例
		a.printInfo();								//调用接口方法
	}
}

public class test6_54 {
	public static void main(String[] args) {
		new XX().fun1();							//实例化XX类对象并调用fun1()方法
	}
}
