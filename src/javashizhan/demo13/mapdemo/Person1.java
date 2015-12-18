package javashizhan.demo13.mapdemo;

public class Person1 {
	private String name;
	private int age;
	public Person1(String name,int age){
		this.name = name;
		this.age = age;
	}
	

	public boolean equals(Object obj) {
		if (this == obj) {				//判断地址是否相等
			return true;				//返回true表示同一对象
		}
		if (!(obj instanceof Person1)) {//传递进来的不是本类的对象
			return false;
		}
		Person1 p =(Person1)obj;		//进行向下转型
		if(this.name.equals(p.name)&&this.age == p.age){
			return true;				//属性依次比较，相等返回true
		}else {
			return false;				//属性内容不相等，返回false
		}
	}
	
	public int hashCode() {						//覆写hashcode
		return this.name.hashCode()*this.age;	//返回信息
	}
	
	public String toString(){					//覆写toString方法
		return "姓名："+this.name+"；年龄："+this.age;
	}
}	
