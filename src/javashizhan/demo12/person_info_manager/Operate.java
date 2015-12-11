package javashizhan.demo12.person_info_manager;

import java.awt.event.FocusAdapter;

public class Operate {
	public static void add() {
		InputData input = new InputData();
		FileOperate fo = new FileOperate("d:\\test.per");
		String name = input.getString("请输入姓名：");
		int age = input.getInt("请输入年龄：","年龄必须为数字！");
		Person per = new Person(name, age);//实例化Person对象
		try {
			fo.save(per);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("信息增加成功");
	}
	
	public static void delete() {
		FileOperate fo = new FileOperate("d:\\test.per");
		try {
			fo.save(null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("信息删除成功");
	}
	
	
	public static void  update() {
		InputData input = new InputData();
		FileOperate fo = new FileOperate("d:\\test.per");
		Person per = null;
		try{
			per = (Person)fo.load();
		}catch(Exception e1){
			e1.printStackTrace();
		}
		String name = input.getString("请输入你新的姓名（原姓名："+per.getName()+"）：");
		int age = input.getInt("请输入新的年龄（原年龄："+per.getAge()+"）：","年龄必须是数字!");
		per = new Person(name, age);
		try {
			fo.save(per);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("信息更新成功!");
	}
	
	
	public static void find() {
		FileOperate fo = new FileOperate("d:\\test.per");
		Person per = null;
		try {
			per = (Person)fo.load();//读取对象
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		System.out.println(per);
	}
}
