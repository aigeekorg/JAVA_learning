package jsoupDemo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


//参考源码地址
//http://www.cnblogs.com/zyw-205520/p/3421687.html
public class JsoupTest2 {
	
//	static String url = "http://www.aigeek.org";
	static String url = "http://www.geekboy.org";
	
	public final static int TIME_OUT = 5000;
	
	public static void main(String[] args) throws IOException {
		BlogBody();
		article();//此处有问题，估计是url的问题，待完善，参考源码
		Blog();//此处有问题，估计是url的问题，待完善，参考源码
	}
	
	/*
	 * 获取指定html文档指定body
	 */
	private static void BlogBody() throws IOException{
		// TODO Auto-generated method stub
		//jsoup.parse为解析一个html文档
		//详见：http://www.cnblogs.com/xinye/archive/2013/08/07/3243181.html
		String html = "<html><head><title>开源中国社区</title></head>"
		+"<body><p>这里是jsoup项目的相关文章</p></body></html>";
		Document doc = Jsoup.parse(html);
		System.out.println(doc.body());
		
		//从url加载html文档
		Document doc2 = Jsoup.connect(url).timeout(TIME_OUT).get();
		String title = doc2.body().toString();//如何知道这就是title？
		System.out.println(title);
		System.out.println("-----------解析完毕-----------");
	}
	
	/*
	 * 获取博客上的文章标题和连接
	 */
	public static void article() {
		Document doc;
		try {
			doc = Jsoup.connect(url).timeout(TIME_OUT).get();
			Elements ListDiv = doc.getElementsByAttributeValue("class","postTitle");
			for (Element element : ListDiv) {
				Elements links = element.getElementsByTag("a");
				for (Element link : links) {
					String linkHref = link.attr("href");
					String linkText = link.text().trim();
					System.out.println(linkHref);
					System.out.println(linkText);
					System.out.println("-----------解析完毕-----------");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/*
	 * 获取指定博客文章内容
	 */
	public static void Blog() {
		Document doc;
		try {
			doc = Jsoup.connect(url).timeout(TIME_OUT).get();
			Elements ListDiv = doc.getElementsByAttributeValue("class", "postBody");
			for (Element element : ListDiv) {
				System.out.println(element.html());
				System.out.println("-----------解析完毕-----------");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
