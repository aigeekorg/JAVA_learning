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
	public abstract void print();//������󷽷�
	public abstract void print1();//������󷽷�
	
}

class B extends A{
	public void print(){
		System.out.println("FLAG="+FLAG);
		System.out.println("���� = "+super.getName());
	}
	
	public void print1(){
		System.out.println("DO NOTHING������һ��p196����ʾ����ֻ�ǵڶ������󷽷�O(��_��)O~");
	}

}

public class test6_20 {
	public static void main(String[] args) {
		B b = new B();//ʵ�����������
		b.print();//���ñ����าд���ķ���
		b.print1();
	}
}