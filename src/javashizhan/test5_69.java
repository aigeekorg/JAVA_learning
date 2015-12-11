package javashizhan;

class Outer{
	private String info = "hello world!";
	class Inner{
		public void print(){
			System.out.println(info);//访问外部类的私有属性
		}
	}
}

public class test5_69 {
	public static void main(String[] args) {
		Outer out = new Outer();			//实例化外部类对象
		Outer.Inner in = out.new Inner();	//实例化内部类对象
		in.print();							//调用内部类方法
	}
}
