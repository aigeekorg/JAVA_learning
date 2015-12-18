package javashizhan.demo13.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = null;
		map = new TreeMap<String, String>();
		map.put("aigeek", "www.aigeek.org");
		map.put("name", "AiGeek");
		map.put("sex", "none");
		Set<String> keys = map.keySet();			//set的泛型和key的泛型要保持一致
		Iterator<String>iter = keys.iterator();
		System.out.println("全部的key:");
		while (iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str+"、");//输出
		}
	}
}
