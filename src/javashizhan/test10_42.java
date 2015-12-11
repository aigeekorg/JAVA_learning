package javashizhan;

public class test10_42 {
	public static void main(String[] args) {
		//声明person对象同时指定contact的类型
		person10_41<Contact10_39> per = null;
		//实例化person对象，同时设置info的信息
		per = new person10_41<Contact10_39>(new Contact10_39("北京市","18665946985", "58000"));
		System.out.println(per);
	}
}
