package javashizhan.demo13.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo08 {
	public static void main(String[] args) {
		Map<Person1, String>map = null;
		map = new HashMap<Person1, String>();
		Person1 per = new Person1("张三", 30);
//		map.put(per, "zhangsan");
//		System.out.println(map.get(per));
		

		map.put(new Person1("张三", 30), "zhangsan");			//增加内容
		
		
		//不同于HashMapDemo06的地方为，这里使用匿名的对象，不用知道其引用地址，依旧可以查找到value		
		System.out.println(map.get(new Person1("张三", 30)));	//查找内容
	}
}
