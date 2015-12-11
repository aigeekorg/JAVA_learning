package javashizhan.demo13.iteratordemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//Iterator的标准操作形式
public class IteratroDemo01 {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();//实例化list接口
		all.add("hello");
		all.add("-");
		all.add("world");
		Iterator<String>iter = all.iterator();//直接实例化Iterator接口
		while (iter.hasNext()) {
			System.out.println(iter.next()+",");
		}
		
	}
}
