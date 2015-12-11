package javashizhan;


class Outer1{
	private String info = "hello world";
	public void fun( final int temp){
		class Inner{
			public void print(){
				System.out.println("类中的属性："+info);
				System.out.println("方法中的参数"+temp);
			}
		};	
		new Inner().print();
	}	
}

public class test5_70 {
	public static void main(String[] args) {
		new Outer1().fun(30);
	}
}
