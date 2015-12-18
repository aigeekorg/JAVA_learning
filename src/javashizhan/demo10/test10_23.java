package javashizhan.demo10;

public class test10_23 {
	
	//下限是String，只能接收String或Object类型的泛型
	public static void fun(testInfo<? super String>temp) {
		System.out.println("内容："+temp);
	}
	
	public static void main(String[] args) {
		testInfo<Object> i1 = new testInfo<Object>();//满足下限范围
		testInfo<String> i2 = new testInfo<String>();//满足上限范围
		i1.setVar(new Object());
//		i1.setVar(30);
		i2.setVar("yaokun");
//		i2.setVar(30);
		fun(i1);
		fun(i2);
	}
}
