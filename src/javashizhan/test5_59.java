package javashizhan;
class Demo0{
	public Demo0(){
		System.out.println("2.���幹�췽��");
	}
	{
		System.out.println("0.�����");
	}
	static{
		System.out.println("1.��̬�����");
	}
}
public class test5_59 {
	static{
		System.out.println("�����������ڵ����ж���ľ�̬�����");
	}
	public static void main(String[] args) {
		new Demo0();//ʵ��������
		new Demo0();//ʵ��������
		new Demo0();//ʵ��������
	}
}
