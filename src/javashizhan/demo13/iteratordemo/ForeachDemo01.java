package javashizhan.demo13.iteratordemo;

import java.util.ArrayList;
import java.util.List;

public class ForeachDemo01 {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("_");
		all.add("world");
		for(String str:all){
			System.out.println(str+"、");
		}
		/*
		 * for(类 对象：集合){
		 * 	//集合操作
		 * }
		 */
	}
}
