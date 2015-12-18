package javashizhan.demo9;
//中断线程的方法,t.interrupt()，同时也说明main()也是一个线程，和新建的线程同时运行，主线程运行的时候将休眠的线程中断了
class MyThread4 implements Runnable{
	public void run(){
		System.out.println("1.进入run方法");
	
		try{
			Thread.sleep(5000);//休眠10s
			System.out.println("2.已经完成休眠");
		}catch(Exception e){
			System.out.println("3.休眠被中止");
			return;
		}
		System.out.println("4.run方法正常结束");
	}
}

public class test9_13 {
	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		Thread t = new Thread(mt,"线程");
		t.start();
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			
		}
		t.interrupt();
	}
}
