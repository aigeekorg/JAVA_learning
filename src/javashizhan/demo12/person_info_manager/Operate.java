package javashizhan.demo12.person_info_manager;

import java.awt.event.FocusAdapter;

public class Operate {
	public static void add() {
		InputData input = new InputData();
		FileOperate fo = new FileOperate("d:\\test.per");
		String name = input.getString("������������");
		int age = input.getInt("���������䣺","�������Ϊ���֣�");
		Person per = new Person(name, age);//ʵ����Person����
		try {
			fo.save(per);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("��Ϣ���ӳɹ�");
	}
	
	public static void delete() {
		FileOperate fo = new FileOperate("d:\\test.per");
		try {
			fo.save(null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("��Ϣɾ���ɹ�");
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
		String name = input.getString("���������µ�������ԭ������"+per.getName()+"����");
		int age = input.getInt("�������µ����䣨ԭ���䣺"+per.getAge()+"����","�������������!");
		per = new Person(name, age);
		try {
			fo.save(per);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("��Ϣ���³ɹ�!");
	}
	
	
	public static void find() {
		FileOperate fo = new FileOperate("d:\\test.per");
		Person per = null;
		try {
			per = (Person)fo.load();//��ȡ����
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		System.out.println(per);
	}
}
