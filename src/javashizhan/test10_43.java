package javashizhan;

public class test10_43 {
	public static void main(String[] args) {
		//����person����ͬʱָ��introduction����
		person10_41<Introduction10_40> per = null;
		//ʵ����person����ͬʱ����Info����Ϣ
		per = new person10_41<Introduction10_40>(new Introduction10_40("yaokun", "��", "26"));
		System.out.println(per);
	}
}
