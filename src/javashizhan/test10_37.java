package javashizhan;

public class test10_37 {
	public static void main(String[] args) {
		Demo<Info<String, Integer>> d = null;	//��Info��ΪDemo�ķ�������
		Info<String, Integer> i = null;			//InfoҪָ��������������
		i = new Info<String, Integer>("yaokun", 26);
		d = new Demo<Info<String,Integer>>(i);		//
		System.out.println("����һ��"+d.gteInfo().getVar());
		System.out.println("���ݶ���"+d.gteInfo().getValue());
				
	}
}
