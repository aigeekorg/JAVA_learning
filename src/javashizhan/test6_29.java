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
		A1 a = new B1();//����ת�ͣ���������ָ���������
		B1 b = (B1)a;//��ָ���������ĸ������ø�����������
		b.fun1();//�������෽�����ѱ���д�ķ���
		b.fun2();//���ø��෽��������fun1()�ѱ���д
		b.fun3();//���������Լ�����ķ���
		System.out.println(b instanceof A1);
		System.out.println(b instanceof B1);
		System.out.println(a instanceof A1);
		System.out.println(a instanceof B1);
		A1 a1 = new A1();
		System.out.println(a1 instanceof A1);
		System.out.println(a1 instanceof B1);
	}
}