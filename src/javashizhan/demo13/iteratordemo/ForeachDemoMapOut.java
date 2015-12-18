package javashizhan.demo13.iteratordemo;

import java.util.HashMap;
import java.util.Map;

public class ForeachDemoMapOut {
	public static void main(String[] args) {
		Map<String, String> map = null;
		
		map = new HashMap<String, String>();
		
		map.put("aigeek", "www.aigeek.org");
		map.put("name", "AiGeek");
		map.put("sex", "none");
		
		for (Map.Entry<String, String> me : map.entrySet()) {
			System.out.println(me.getKey()+"-->"+me.getValue());
		}
	}
}
