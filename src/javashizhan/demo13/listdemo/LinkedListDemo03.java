package javashizhan.demo13.listdemo;

import java.util.LinkedList;

public class LinkedListDemo03 {
	public static void main(String[] args) {
		LinkedList<String> link= new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		System.out.println("以FIFO的方式输出，链表尺寸为"+link.size());
		for(int i=0;i < link.size()+2;i++){
			System.out.println("链表尺寸为"+link.size());
			System.out.println(link.poll()+"、");
		}
	}
}
