package javashizhan;

public class test10_13 {
	public static void main(String[] args) {

	//	testInfo<String> i = new testInfo<String>();//ָ��StringΪ��������
		//String�޷����뷽��fun�е�Object�����У�����ʹ��ͨ���?��������
		testInfo<?> i = new testInfo<String>();//ʹ��ͨ���
	//	i.setVar("Ҧ��");//�����ַ���
		i.setVar(null);//ʹ��ͨ����޷����÷���ָ�����ַ������ݣ�ֻ������null
		fun(i);
	}
	/*String�޷����뷽��fun�е�Object�����У�����ʹ��ͨ���?��������
	public static void fun(testInfo<Object> temp) {//�˴�����ֱ�ӽ���Object�������͵�testInfo����
		System.out.println("���ݣ�"+temp);
		
	}
	*/
	public static void fun(testInfo<?> temp) {//�˴�����ֱ�ӽ���Object�������͵�testInfo����
		System.out.println("���ݣ�"+temp);
		
	}

	
}
