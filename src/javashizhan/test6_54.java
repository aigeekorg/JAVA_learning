package javashizhan;
//�����ڲ������

interface AA{
	public void printInfo();
}

class XX{
	public void fun1(){
		this.fun2(new AA(){							//�����ڲ���
			public void printInfo(){				//ʵ�ֽӿ�����븲д�ӿ��е����г��󷽷�
				System.out.println("Hello World!!!");
			}
		});
	}
	public void fun2(AA a){							//���սӿ�ʵ��
		a.printInfo();								//���ýӿڷ���
	}
}

public class test6_54 {
	public static void main(String[] args) {
		new XX().fun1();							//ʵ����XX����󲢵���fun1()����
	}
}
