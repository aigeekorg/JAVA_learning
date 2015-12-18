package javashizhan.demo13.mapdemo;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<String,String> map = null;//声明对象
		map = new TreeMap<String,String>();//实例化SortedMap对象
		map.put("D、TENCENT", "HTTP://WWW.TENCENT.COM");
		map.put("A、ITOUFU", "WWW.ITOUFU.COM");
		map.put("C、BAIDU", "WWW.BAIDU.COM");
		map.put("B、ALIBABA","WWW.AILIBABA.COM");
		
		System.out.println("第一个元素key："+map.firstKey());
		System.out.println("；对应的值："+map.get(map.firstKey()));
		
		System.out.println("最后一个元素key:"+map.lastKey());
		System.out.println("；对应的值："+map.get(map.lastKey()));
		
		System.out.println("返回小于指定范围的集合");
		for (Map.Entry<String, String> me  : map.headMap("B、ALIBABA").entrySet()) {
			System.out.println("\t|-"+me.getKey()+"-->"+me.getValue());
		}
		
		System.out.println("返回大于等于指定范围的集合");
		for (Map.Entry<String, String> me  : map.tailMap("B、ALIBABA").entrySet()) {
			System.out.println("\t|-"+me.getKey()+"-->"+me.getValue());
		}
		
		System.out.println("部分集合");
		for (Map.Entry<String, String> me  : map.subMap("A、ITOUFU", "C、BAIDU").entrySet()) {
			System.out.println("\t|-"+me.getKey()+"-->"+me.getValue());
		}
	}
}
