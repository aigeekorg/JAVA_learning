package javashizhan.demo13.mapdemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = null;
		map = new WeakHashMap<String, String>();//弱引用，无论内存是否紧张，被垃圾回收器发现立即回收
		map.put("aigeek", "www.aigeek.org");
		map.put("name", "AiGeek");
		map.put("sex", "none");
		System.gc();//进行垃圾回收
		
		
		map.put(new String("freshman"), new String("www...org"));
		System.out.println("内容"+map);//垃圾回收之后只剩下一个内容
	}
}
