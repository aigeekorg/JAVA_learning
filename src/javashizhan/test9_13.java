package javashizhan;
//�ж��̵߳ķ���,t.interrupt()��ͬʱҲ˵��main()Ҳ��һ���̣߳����½����߳�ͬʱ���У����߳����е�ʱ�����ߵ��߳��ж���
class MyThread4 implements Runnable{
	public void run(){
		System.out.println("1.����run����");
	
		try{
			Thread.sleep(5000);//����10s
			System.out.println("2.�Ѿ��������");
		}catch(Exception e){
			System.out.println("3.���߱���ֹ");
			return;
		}
		System.out.println("4.run������������");
	}
}

public class test9_13 {
	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		Thread t = new Thread(mt,"�߳�");
		t.start();
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			
		}
		t.interrupt();
	}
}
