package javashizhan;

class Math3{
	public int div(int i,int j) throws Exception{
		System.out.println("*****���㿪ʼ*****");
		int temp = 0;
		try{
			temp = i/j;
		}catch(Exception e){
			throw e;//���쳣�׳������throws���쳣�ᱻ�׳����������ó�
		}finally{//�����Ƿ����쳣����ִ�д˲���
			System.out.println("*****�������*****");
		}
		return temp;
	}
}

public class test7_13 {
	public static void main(String[] args) {
		Math3 m = new Math3();
		try{
			System.out.println("����������"+m.div(10,0));
		}catch(Exception e){
			System.out.println("�쳣������"+e);
		}
	}
}
