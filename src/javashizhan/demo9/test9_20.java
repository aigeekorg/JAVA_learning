package javashizhan.demo9;

/*
class MyThread7 implements Runnable{
	private int ticket = 5;
	public void run(){
		for (int i = 0; i < 100; i++) {
			synchronized (this) {
				if (ticket>0) {
					try {
						Thread.sleep(300);	
					} catch (InterruptedException e) {
						e.printStackTrace();// TODO: handle exception
					}
					System.out.println("卖票：ticket="+ticket--);
				}
			}
		}
	}
}
*/
public class test9_20 {
	public static void main(String[] args) {
		MyThread7 mt = new MyThread7();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		t1.start();
		t2.start();
		t3.start();		
	}
}


class MyThread7 implements Runnable{
	private int ticket = 5;	
	public void run(){
		for (int i = 0; i < 100; i++) {
			this.sale();
		}
	}
	public synchronized void sale(){
		if (ticket>0) {
			try {
				Thread.sleep(300);	
			} catch (InterruptedException e) {
				e.printStackTrace();// TODO: handle exception
			}
			System.out.println("卖票：ticket="+ticket--);
		}

	}
}
