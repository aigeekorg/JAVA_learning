package javashizhan;

public class test10_23 {
	
	//������String��ֻ�ܽ���String��Object���͵ķ���
	public static void fun(testInfo<? super String>temp) {
		System.out.println("���ݣ�"+temp);
	}
	
	public static void main(String[] args) {
		testInfo<Object> i1 = new testInfo<Object>();//�������޷�Χ
		testInfo<String> i2 = new testInfo<String>();//�������޷�Χ
		i1.setVar(new Object());
//		i1.setVar(30);
		i2.setVar("yaokun");
//		i2.setVar(30);
		fun(i1);
		fun(i2);
	}
}
