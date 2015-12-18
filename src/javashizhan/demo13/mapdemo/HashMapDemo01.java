package javashizhan.demo13.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
	public static void main(String[] args) {
		Map<String, String> map = null;
		map = new HashMap<String, String>();
		map.put("aigeek", "www.aigeek.org");
		map.put("name", "AiGeek");
		map.put("sex", "none");
		String val = map.get("sex");
		System.out.println("取出内容为："+val);
		if(map.containsKey("name")){
			System.out.println("存在搜索的key");
		}else {
			System.out.println("存在搜索的key!");
		}
		if (map.containsValue("AiGeek")) {
			System.out.println("存在搜索的value");
		} else {
			System.out.println("搜索的value不存在！");
		}
		
		printMap(map);
	}

	private static void printMap(Map<String, String> map) {
		// TODO Auto-generated method stub
//		map = new HashMap<String, String>();		//key 和value的泛型，这里不用再进行向下转型，
													//否则会重新实例化导致map为空。
													//由于keySet()方法也是Map的方法所以没问题
		
		
		
		Set<String> keys = map.keySet();			//set的泛型和key的泛型要保持一致
		Iterator<String>iter = keys.iterator();
		System.out.println("全部的key:");
		while (iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str+"、");//输出
		}
		
		
		Collection<String> values = map.values();
		Iterator<String> iter1 = values.iterator();
		System.out.println("全部的value:");
		while (iter1.hasNext()) {
			String str1 = iter1.next();
			System.out.println(str1+"、");
		}
		
		
		
	}

}
