package javashizhan.demo13.mapdemo;

import java.util.HashMap;
import java.util.Map;

//String 到 Person  的映射

public class HashMapDemo05 {
	public static void main(String[] args) {
		Map<String, Person> map = null;//声明map对象
		map = new HashMap<String, Person>();//实例化map对象
		map.put("zhangsan", new Person("张三", 30));//增加内容
		System.out.println(map.get("zhangsan"));
		
	}
}
