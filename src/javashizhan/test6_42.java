package javashizhan;

//��һ�����������нӿڣ��ڸó����౻�̳�ʱ�ӿڵĴ����������

abstract class A2{
	public abstract void printA();
	interface B{
		public void printB();
	}
	abstract class C{
		public abstract void printC();//������󷽷��������abstract�ؼ��ʣ��������һ����ͨ��������Ҫ������{}
	}
}

class X extends A2{
	public void printA(){
		System.out.println("HELLO-->A");
	}
	
	/*	���ﱻ����Ҳ���ᱨ��������Ϊ��˵���̳г����������ֻ��ʵ��ֱ���ڳ�����ĳ��󷽷���
	 * ������ʵ�ָó������ڲ��Ľӿںͳ������еĳ��󷽷�
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
/* 		X x = new A2();//��������ʵ����A2����Ϊ������������ת�ͣ�����xû��������ת�ͣ���������ᷢ������
*/		
		A2 a = new X();//����ת�ͣ���������ָ���������
		a.printA();
/*
		X x = (X)a;//��ʱ����Խ�������ת�ͣ���Ϊa�Ѿ���������ת�ʹ�����
*/		

/*
 		A2.B b = new X().new Y();
		b.printB();//���ñ���д����
 */

/*
		A2.C c = new X().new Z();
		c.printC();//���ñ���д����
*/
	}
}
