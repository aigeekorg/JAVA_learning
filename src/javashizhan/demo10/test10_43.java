package javashizhan.demo10;

public class test10_43 {
	public static void main(String[] args) {
		//声明person对象，同时指定introduction类型
		person10_41<Introduction10_40> per = null;
		//实例化person对象，同时设置Info的信息
		per = new person10_41<Introduction10_40>(new Introduction10_40("yaokun", "男", "26"));
		System.out.println(per);
	}
}
