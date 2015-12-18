package javademo.jsondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
//注意以下的文件，是从\sdk\add-ons中的Json-lib包获取到的，额外添加的，下载网址
//http://sourceforge.net/projects/json-lib/?source=typ_redirect
//代码有问题无法运行，待验证
//原网址：http://www.open-open.com/lib/view/open1391842371442.html
import net.sf.json.JSONArray;   
import net.sf.json.JSONObject;   

public class JavaJsonTest {
    public static void main(String[] args){     
        JSONObject obj=new JSONObject();   
        obj.put("kk","27");   
        obj.put("dad", "57");   
        obj.put("mom", "55");   
        System.out.println("通过构造器的方式创建的JSONObject对象："+obj);   
             
        Map<String,String> map=new LinkedHashMap<>();   
        map.put("kk","27");   
        map.put("dad", "57");   
        map.put("mom", "55");   
        System.out.println("通过fromObject方法将map对象转换为JSONObject对象："+JSONObject.fromObject(map));   
             
        JSONArray arr=new JSONArray();   
        arr.add(0,"kk");   
        arr.add(1,"dad");   
        arr.add(2,"mom");   
        System.out.println("通过构造器的方式创建的JSONArray："+arr);   
             
        ArrayList<String> list=new ArrayList<>();   
        list.add("kk");   
        list.add("dad");   
        list.add("mom");   
        System.out.println("通过fromObject方法将Arraylist对象转换为JSONArray对象："+JSONArray.fromObject(list));   
             
        System.out.println("将HashMap对象通过fromObject方法转换为 JSONArray 对象"+JSONArray.fromObject(map));   
             
        String str="{\"kk\":23,\"dad\":49,\"mom\":45}";   
        System.out.println("解析之后的JSON对象："+JSONObject.fromObject(str));   
             
        //遍历输出   
        Iterator<String> it=obj.keys();   
        
        while(it.hasNext()){   
            String key=it.next();   
            System.out.println(key+":"+obj.get(key));   
        }   
     }   
}
