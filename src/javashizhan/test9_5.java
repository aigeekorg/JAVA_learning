package javashizhan;

class MyThread3 implements Runnable{
	private String name;
	public MyThread3(String name){
		this.name = name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"���У�i="+i);
		}
	}
}

public class test9_5 {
	public static void main(String[] args) {
		MyThread3 my1 = new MyThread3("�߳�A");
//		MyThread3 my2 = new MyThread3("�߳�B");
		
		
		
		Thread t1 = new Thread(my1);
//		Thread t2 = new Thread(my2);
		
		t1.start();
		t1.start();//����start()���ִ���
//		
//		new Thread(my1).start();
//		new Thread(my1).start();//��ʱʹ������start()ȴû�д��󣿣�

	}
}
