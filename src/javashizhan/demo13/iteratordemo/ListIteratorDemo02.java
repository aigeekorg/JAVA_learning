package javashizhan.demo13.iteratordemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo02 {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();//实例化list接口
		all.add("hello");
		all.add("_");
		all.add("world");
		ListIterator<String>iter = all.listIterator();//实例化ListIterator接口
		System.out.println("由前向后输出：");
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str+"、");
			iter.set("LI-"+str);
		}
		System.out.println("\n 由后向前输出");
		iter.add("LXH");
		while (iter.hasPrevious()) {
			String str = iter.previous();
			System.out.println(str+"、");
			
		}
	}
}
