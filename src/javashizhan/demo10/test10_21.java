package javashizhan.demo10;

public class test10_21 {
	
	public static void main(String[] args) {
		testInfo2<Integer> i1 = new testInfo2<Integer>();	//声明Integer的泛型对象
		i1.setVar(43);										//设置setVar()的具体参数值
		System.out.println("内容："+i1);
	}
	
}
