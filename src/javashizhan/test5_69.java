package javashizhan;

class Outer{
	private String info = "hello world!";
	class Inner{
		public void print(){
			System.out.println(info);//�����ⲿ���˽������
		}
	}
}

public class test5_69 {
	public static void main(String[] args) {
		Outer out = new Outer();			//ʵ�����ⲿ�����
		Outer.Inner in = out.new Inner();	//ʵ�����ڲ������
		in.print();							//�����ڲ��෽��
	}
}
