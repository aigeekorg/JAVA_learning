package javashizhan.demo13.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo2 {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();				//实例化List
		
		//为集合增加内容
		Collections.addAll(all, "AIGEEK","KEN","AIGEEK.ORG");	//增加内容
		
		
		//输出集合所有内容
		Iterator<String>iter = all.iterator();					//实例化Iterator对象		
		while (iter.hasNext()) {								//迭代输出
			System.out.println(iter.next()+"、");				//输出内容
		}
		System.out.println("-----");
		
		
		//反转集合所有内容reverse()
		System.out.println("反转集合所有内容");
		Collections.reverse(all);
		Iterator<String> iter1 = all.iterator();
		while (iter1.hasNext()) {								//迭代输出
			System.out.println(iter1.next()+"、");				//输出内容
		}
		System.out.println("-----");
		
		//检索集合内容binarySearch()
		int point = Collections.binarySearch(all, "LI");		//检索内容不存在，输出负数
		System.out.println("检索结果："+point);					//输出位置
		System.out.println("-----");
		
		//替换集合中的内容replaceALL()
		if (Collections.replaceAll(all, "AIGEEK", "爱极客")) {
			System.out.println("内容替换成功！");
		}
		System.out.println("替换之后的结果");
		Iterator<String>iter2 = all.iterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next()+"、");
		}
		System.out.println("-----");
		
		
		//集合排序sort(),按首字母顺序，数字排序靠前
		List<String>all1 = new ArrayList<String>();
		Collections.addAll(all1, "1、AIGEEK","2、KEN","X、AIGEEK.ORG");
		Collections.addAll(all1, "B、WWW.AILIBABA.COM");
		Collections.addAll(all1, "A、WWW.AIGEEK.COM");
		System.out.println("排序之前的集合:");
		Iterator<String>iter3 = all1.iterator();
		while (iter3.hasNext()) {
			System.out.println(iter3.next()+"、");			
		}
		Collections.sort(all1);
		System.out.println("\n排序之后的集合：");
		iter3 = all1.iterator();
		while (iter3.hasNext()) {
			System.out.println(iter3.next()+"、");				
		}
		System.out.println("-----");
		
		//交换指定位置的内容，使用swap()方法将集合中两个位置内容交换
		List<String>all2 = new ArrayList<String>();
		Collections.addAll(all2, "1、AIGEEK","2、KEN","3、AIGEEK.ORG");
		System.out.println("交换之前的集合：");
		Iterator<String>iter4 = all2.iterator();
		while (iter4.hasNext()) {
			System.out.println(iter4.next()+"、");				
		}
		Collections.swap(all2, 0, 2);//位置0（第0个）和位置2（第2个）的元素交换
		System.out.println("\n交换之后的集合：");
		iter4 = all2.iterator();
		while (iter4.hasNext()) {
			System.out.println(iter4.next()+"、");			
		}
		System.out.println("-----");
		
	}
}
