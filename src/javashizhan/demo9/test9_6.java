package javashizhan.demo9;
//继承thread的多线程实现

class MyThread extends Thread{
	private int ticket = 5;
	public void run(){
		for(int i = 0;i<100;i++){
			if(ticket>0){
				System.out.println("卖票：ticket = "+ticket--);
			}
		}
	}
}

public class test9_6 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();

//		MyThread mt2 = new MyThread();
//		MyThread mt3 = new MyThread();
		mt1.start();
		
		mt1.start();
		mt1.start();
		
//		mt2.start();
//		mt3.start();
	}
}
