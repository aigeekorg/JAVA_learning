package javashizhan.demo13.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo07 {
	public static void main(String[] args) {
		Map<Person, String>map = null;
		map = new HashMap<Person, String>();
		Person per = new Person("张三", 30);
		map.put(per, "zhangsan");
		
		
		//使用非匿名的对象，查找到value，需要道匿名对象的引用地址
		System.out.println(map.get(per));
	}
}
