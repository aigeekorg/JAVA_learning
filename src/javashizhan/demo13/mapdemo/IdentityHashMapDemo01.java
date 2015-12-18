package javashizhan.demo13.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//HashMap集合不允许重复的key，因此对于重复的key("张三", 30)，本demo只会输出一个value
public class IdentityHashMapDemo01 {
	public static void main(String[] args) {
		Map<Person1, String> map = null;
		map = new HashMap<Person1, String>();//实例化Map对象
		map.put(new Person1("张三", 30), "zhangsan_1");
		map.put(new Person1("张三", 30), "zhangsan_2");
		map.put(new Person1("李四", 31), "lisi");
		
		Set<Map.Entry<Person1, String>>allSet = null;
		allSet = map.entrySet();//将Map接口实例变为Set接口实例
		
		Iterator<Map.Entry<Person1, String>> iter = null;
		iter = allSet.iterator();//实例化iterator对象
		
		while (iter.hasNext()) {
			Map.Entry<javashizhan.demo13.mapdemo.Person1, java.lang.String> me = iter
					.next();//每个对象都是Map.Entry的实例
			System.out.println(me.getValue());//输出key和value
			
		}
	}
}
