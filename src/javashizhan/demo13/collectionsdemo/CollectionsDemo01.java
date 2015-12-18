package javashizhan.demo13.collectionsdemo;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionsDemo01 {
	public static void main(String[] args) {
		List<String> allList = Collections.emptyList();//返回不可变的空List集合
		Set<String> allSet = Collections.emptySet();//返回不可变的空List集合
		//通过上述方法返回的对象无法进行增加数据操作，因为这种方式返回的对象没有add方法
		allList.add("Hello");
	}
}
