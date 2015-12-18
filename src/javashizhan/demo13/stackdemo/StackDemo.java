package javashizhan.demo13.stackdemo;

import java.util.Stack;


//先入栈者后出栈，为空时出栈报错
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s.pop()+"、");
		System.out.println(s.pop()+"、");
		System.out.println(s.pop()+"、");
		System.out.println(s.pop()+"、");
	}
}
