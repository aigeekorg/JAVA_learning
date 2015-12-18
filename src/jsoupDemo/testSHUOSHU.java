package jsoupDemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


//注：这里的硕鼠URL没什么用了，因为加了广告就不会暴露真实的URL了
//以前在网页上会直接把暴露下载的URL是可以直接进行下载的。
public class testSHUOSHU {

	public static void main(String[] args) {
		String url = "http://v.youku.com/v_show/id_XMTQxMzg5MDY1Ng==.html?f=26343628&ev=1&from=y1.3-idx-uhome-1519-20887.205805-205902.1-1";
		
		List<String> str = new ArrayList<String>();
		str = GetVideoUrlParseUtils.converUrl(url);
		Iterator<String> iter = str.iterator();
		while (iter.hasNext()) {
			String strout = (String) iter.next();
			System.out.println(strout);
		}
		System.out.println("----end----");
		
	}
	
}
/**
 * 
 * ClassName: UrlParseUtils
 * 
 * @Description: 硕鼠一个爬取视频的真是地址的网站。难道这不会侵权吗？我表示很无语了
 * @author maxudong
 * @date 2015年9月15日
 */
final class GetVideoUrlParseUtils {

	public static final int TIME_OUT = 10000;
	private static final String END_TEXT = "花费时间";
	private static final String BEING_TEXT = "下载地址";
	public static final String FLVCD_CONVER_URL = "http://www.flvcd.com/parse.php?&go=1&format=super&kw=";

	/**
	 * 
	 * @Description: 硕鼠抓取的网页信息
	 * @param @param
	 *            url
	 * @param @return
	 * @param @throws
	 *            IOException
	 * @return Document
	 * @throws @author
	 *             maxudong
	 * @date 2015年9月16日
	 */
	public static Document getDocument(String url) throws IOException {
		//s代表 String. format("%s %s", "hello", "Hello"),的format结果为hello Hello;注意前面%s %s有空格，所以后面hello Hello也有空格格
		//这里将硕鼠下载网址和要下载的网址使用格式化匹配，就可以直接下载了
		//养成阅读英文源码的好习惯
		//http://developer.android.com/reference/java/util/Formatter.html#format
		String crawlerUrl = String.format("%s%s", FLVCD_CONVER_URL, url);
		Connection connect = Jsoup.connect(crawlerUrl).timeout(TIME_OUT);
		Document document = null;
		//选择移动设备
		document = connect.userAgent("AppleCoreMedia/1.0.0.7B367 (iPad; U; CPU OS 4_3_3 like Mac OS X)").get();
		return document;

	}

	/**
	 * 
	 * @Description: 根据传入的url获取真实的地址
	 * @param url
	 * @return String
	 * @author maxudong
	 * @throws IOException
	 * @date 2015年9月15日
	 */
	public static List<String> converUrl(String url) {

		if (url == null || "".equals(url)) {
			return null;
		}
		List<String> urls = new ArrayList<String>();
		Document document;
		try {
			document = getDocument(url);//获取拼接的url地址
			String str = document.html();
			int index = str.indexOf(BEING_TEXT);
			if (index > 0) {
				Element playElement = document.html(str.substring(index, str.indexOf(END_TEXT)));
				Elements es = playElement.getElementsByTag("a");
				if (es != null) {
					for (Element e : es) {
						urls.add(e.absUrl("href"));
					}
				}
			}
		} catch (Exception e) {
		}
		return urls;
	}
	
}
