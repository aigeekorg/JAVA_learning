package javashizhan.demo13.mapdemo;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;




//IdentityHashMap集合允许重复的key，因此本demo会输出所有 的key并且无论它是否重复（地址不能相等），这里会输出所有key为 ("张三", 30)的value
public class IdentityHashMapDemo02 {
	public static void main(String[] args) {
		Map<Person1, String> map = null;
		map = new IdentityHashMap<Person1, String>();//实例化IdentityHashMap对象
		map.put(new Person1("张三", 30), "zhangsan_1");
		map.put(new Person1("张三", 30), "zhangsan_2");
		map.put(new Person1("李四", 31), "lisi");
		
		Set<Map.Entry<Person1, String>>allSet = null;
		allSet = map.entrySet();//将Map接口实例变为Set接口实例
		
		Iterator<Map.Entry<Person1, String>> iter = null;
		iter = allSet.iterator();//实例化iterator对象
		
		while (iter.hasNext()) {
			Map.Entry<Person1, String> me = iter.next();//每个对象都是Map.Entry的实例
			System.out.println("key="+me.getKey()+";value="+me.getValue());//输出key和value
			System.out.println("其hashCode为:"+me.hashCode());
			
		}
	}

}
