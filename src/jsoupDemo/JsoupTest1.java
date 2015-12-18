package jsoupDemo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest1 {
	
	private final static int TIME_OUT0 = 5000;	
	
	public static void main(String[] args) throws IOException{
		

		String url = "http://www.aigeek.org";
		String url1 = "http://www.geekboy.org";
		
		{
			long start = System.currentTimeMillis();
			Document doc = null;
			try {
				//设置timeout的目的是防止出现socket的超时异常报错
				//详细原因见 http://blog.csdn.net/tfy1332/article/details/21648201
				doc = Jsoup.connect(url).timeout(TIME_OUT0).get();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally{
				System.out.println("Time is:"+(System.currentTimeMillis()-start)+"ms");
			}
			System.out.println("---------------获取title----------------");
			Elements elem = doc.getElementsByTag("Title");
			System.out.println("Title is:"+elem.text());
			//doc和html内容是一样的
			System.out.println("--------------获取的doc-----------------");
			System.out.println(doc);
			System.out.println("--------------获取的html-----------------");
			System.out.println(doc.html());
		}
		System.out.println("-------------------------------");
		
		{
			long start1 = System.currentTimeMillis();
			Document doc1 = null;
			try {
				//设置timeout的目的是防止出现socket的超时异常报错
				//详细原因见 http://blog.csdn.net/tfy1332/article/details/21648201
				doc1 = Jsoup.connect(url1).timeout(TIME_OUT0).get();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally{
				System.out.println("Time is:"+(System.currentTimeMillis()-start1)+"ms");
			}
			Elements elem1 = doc1.getElementsByTag("Title");
			System.out.println("Title is:"+elem1.text());
		}
	}
}
