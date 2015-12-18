package javashizhan.demo10;

public class test10_37 {
	public static void main(String[] args) {
		Demo<Info<String, Integer>> d = null;	//将Info作为Demo的泛型类型
		Info<String, Integer> i = null;			//Info要指定两个泛型类型
		i = new Info<String, Integer>("yaokun", 26);
		d = new Demo<Info<String,Integer>>(i);		//
		System.out.println("内容一："+d.gteInfo().getVar());
		System.out.println("内容二："+d.gteInfo().getValue());
				
	}
}
