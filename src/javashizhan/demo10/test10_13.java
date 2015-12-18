package javashizhan.demo10;

public class test10_13 {
	public static void main(String[] args) {

	//	testInfo<String> i = new testInfo<String>();//指定String为泛型类型
		//String无法传入方法fun中的Object类型中，可以使用通配符?进行设置
		testInfo<?> i = new testInfo<String>();//使用通配符
	//	i.setVar("姚坤");//设置字符串
		i.setVar(null);//使用通配符无法设置泛型指定的字符串内容，只能设置null
		fun(i);
	}
	/*String无法传入方法fun中的Object类型中，可以使用通配符?进行设置
	public static void fun(testInfo<Object> temp) {//此处可以直接接受Object泛型类型的testInfo对象
		System.out.println("内容："+temp);
		
	}
	*/
	public static void fun(testInfo<?> temp) {//此处可以直接接受Object泛型类型的testInfo对象
		System.out.println("内容："+temp);
		
	}

	
}
