package javashizhan;
class MyThread6 implements Runnable{
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+"������");
		}
	}
}
public class test9_14 {
	MyThread6 mt = new MyThread6();
	Thread t = new Thread(mt,"�߳�");
	
	//t.setDaemon(true);
	//t.start();	
}




