package javashizhan;

class MyThread1 implements Runnable{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"mt  run-->"+i);//����߳�����
		}
	}
}

public class test9_11 {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		Thread t = new Thread(mt,"�߳�");
		t.start();
		for(int i = 0 ;i<50;i++){
			if(i>10){
				try{
					t.join();
				}catch(Exception e){}
			}
			System.out.println("Main �߳�����-->"+i);
		}
	}
}
