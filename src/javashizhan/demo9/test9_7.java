package javashizhan.demo9;
//实现Runnable接口的多线程实现

class MyThread2 implements Runnable{
	private int ticket = 5;
	public void run(){
		for(int i=1;i<100;i++){
			if(ticket>0){
				System.out.println("卖票：ticket = " + ticket--);
			}
		}
	}
}

public class test9_7 {
	public static void main(String[] args) {
		MyThread2 my = new MyThread2();
		new Thread(my).start();
		new Thread(my).start();
		new Thread(my).start();
	}
}
