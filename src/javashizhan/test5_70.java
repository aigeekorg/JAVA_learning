package javashizhan;


class Outer1{
	private String info = "hello world";
	public void fun( final int temp){
		class Inner{
			public void print(){
				System.out.println("���е����ԣ�"+info);
				System.out.println("�����еĲ���"+temp);
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
