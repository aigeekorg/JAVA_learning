package javashizhan.demo13.iteratordemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * 这使用Iterator输出Map实例，以下操作流程是Map输出的最标准流程
 */
public class IteratorDemoMapOut {
	public static void main(String[] args) {
		Map<String, String> map = null;
		map = new HashMap<String, String>();
		
		map.put("aigeek", "www.aigeek.org");
		map.put("name", "AiGeek");
		map.put("sex", "none");
		
		Set<Map.Entry<String, String>> allSet = null;	//声明set集合，指定泛型。设置Map类型的集合对象
		allSet = map.entrySet();						//将map接口变为set接口
		
		Iterator<Map.Entry<String, String>>iter = null;	//声明iterator对象
		iter = allSet.iterator();						//实例化iterator对象
		
		while (iter.hasNext()) {
			Map.Entry<String, String> me = iter.next();
			System.out.println(me.getKey()+"-->"+me.getValue());
		}		
	}
}
