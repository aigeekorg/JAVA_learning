package javashizhan;

public class test10_42 {
	public static void main(String[] args) {
		//����person����ͬʱָ��contact������
		person10_41<Contact10_39> per = null;
		//ʵ����person����ͬʱ����info����Ϣ
		per = new person10_41<Contact10_39>(new Contact10_39("������","18665946985", "58000"));
		System.out.println(per);
	}
}
