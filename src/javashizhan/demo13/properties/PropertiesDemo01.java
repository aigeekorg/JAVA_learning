package javashizhan.demo13.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo01 {
	public static void main(String[] args) {
		Properties pro = new Properties();//创建Properties()对象
		pro.setProperty("BJ", "BeiJing");
		pro.setProperty("TJ", "TianJin");
		pro.setProperty("NJ", "NanJing");
		
		System.out.println("1、BJ属性存在："+pro.getProperty("BJ"));
		System.out.println("2、SC属性不存在"+pro.getProperty("SC"));
		System.out.println("3、SC属性不存在，同时设置默认的显示值:"+pro.getProperty("SC","-->没有发现"));		
		
		System.out.println("-----");
		System.out.println("保存属性到普通的文件中");
		//设置属性文件的保存路径
		File file = new File("D:"+File.separator+"area.properties");
		try {
			//保存属性到普通文件中，并设置注释内容
			pro.store(new FileOutputStream(file), "Area Info");//Area Info为注释
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("保存成功！");
		
		

		System.out.println("-----");
		System.out.println("从普通文件中读取属性及注释内容");
		//设置属性文件的保存路径
		File file1 = new File("D:"+File.separator+"area.properties");
		try {
			pro.load(new FileInputStream(file1));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("BJ属性值存在，内容是："+pro.getProperty("BJ"));
		
		
		
		System.out.println("-----");
		System.out.println("将属性保存在XML文件中");
		//设置属性文件的保存路径
		File file2 = new File("D:"+File.separator+"area.xml");
		try {
			pro.storeToXML(new FileOutputStream(file2), "Area Info");//保存属性到XML
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("保存成功！");

		
		
		System.out.println("-----");
		System.out.println("从XML文件中读取属性");
		//设置XML文件的保存路径
		File file3 = new File("D:"+File.separator+"area.XML");//.XML大小写无关
		try {
			pro.loadFromXML(new FileInputStream(file3));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("BJ属性值存在，内容是："+pro.getProperty("BJ"));
		
		
	}
}
