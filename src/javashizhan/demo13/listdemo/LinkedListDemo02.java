package javashizhan.demo13.listdemo;

import java.util.LinkedList;

public class LinkedListDemo02 {
	public static void main(String[] args) {
		LinkedList<String> link= new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		System.out.println("1-1、element()方法找到表头："+link.element());
		System.out.println("1-2、找完之后的链表内容："+link);
		System.out.println("2-1、peek()方法找到表头："+link.peek());//link.peek找到不删除表头
		System.out.println("2-2、找完之后的链表内容："+link);
		System.out.println("3-1、poll()方法找到表头："+link.poll());//link.poll找到并删除表头
		System.out.println("3-2、找完之后的链表内容："+link);
	}
}
