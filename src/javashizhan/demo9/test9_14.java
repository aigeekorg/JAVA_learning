package javashizhan.demo9;
class MyThread6 implements Runnable{
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+"在运行");
		}
	}
}
public class test9_14 {
	MyThread6 mt = new MyThread6();
	Thread t = new Thread(mt,"线程");
	
	//t.setDaemon(true);
	//t.start();	
}




