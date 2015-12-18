package javashizhan.demo13.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo06 {
	public static void main(String[] args) {
		Map<Person, String> map = null;						//声明Map对象，指定泛型类型
		map = new HashMap<Person, String>();				//实例化Map对象
		map.put(new Person("张三", 30), "zhangsan");			//增加内容
		
		
		//使用匿名的对象，查找到value，不需知道匿名对象的引用地址
		System.out.println(map.get(new Person("张三", 30)));	//查找内容
	}
}
