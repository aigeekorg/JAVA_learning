package javashizhan;


//递归调用构造方法示例

/*

 
 
public class test5_45 {
	public static void main(String[] args) {
		Person1 per1 = new Person1("张三",33);//调用有参构造
		System.out.println(per1.getInfo());//调出信息
	}

}


*/

/*
 * 
 * 
class Person1{
	private String name;
	private int age;
	public Person1(){
		this("张三",33);
	}
	public Person1(String name){
		this();
	}
	public Person1(String name, int age){
		this("张三");
		this.name = name;
		this.age = age;
	}
	public String getInfo(){
		return "姓名："+name+"，年龄，"+age;
		
	}



*/
/*
	class Person1{
		private String name;
		private int age;
		public Person1(){
//			this("张三",33);
		}
		public Person1(String name){
			this("张三");
		}
		public Person1(String name, int age){
			this();
			this.name = name;
			this.age = age;
		}
		public String getInfo(){
			return "姓名："+name+"，年龄，"+age;
			
		}

}
*/