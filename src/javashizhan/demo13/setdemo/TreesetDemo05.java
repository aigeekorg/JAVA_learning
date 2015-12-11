package javashizhan.demo13.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetDemo05 {
	public static void main(String[] args) {
		SortedSet<String> allSet = new TreeSet<String>();//为SortedSet实例化
		allSet.add("A");
		allSet.add("B");
		allSet.add("C");
		allSet.add("C");
		allSet.add("C");
		allSet.add("D");
		allSet.add("E");
		System.out.println("第一个元素："+allSet.first());//返回第一个元素
		System.out.println("最后一个元素："+allSet.last());//返回最后一个元素
		System.out.println("headSet元素( 返回开始到指定元素(不含) 的集合)："+allSet.headSet("C"));//返回开始到制定元素 集合
		System.out.println("tailSet元素( 从指定元素(含)到最后元素 的集合)："+allSet.tailSet("C"));//从指定元素到最后元素 的集合
		System.out.println("subSet元素( 返回指定对象间元素[前含后不含) 的集合)："+allSet.subSet("B","D"));//返回指定对象间元素 的集合
	}
}
