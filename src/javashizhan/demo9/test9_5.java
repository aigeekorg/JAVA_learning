package javashizhan.demo9;

class MyThread3 implements Runnable{
	private String name;
	public MyThread3(String name){
		this.name = name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"运行，i="+i);
		}
	}
}

public class test9_5 {
	public static void main(String[] args) {
		MyThread3 my1 = new MyThread3("线程A");
//		MyThread3 my2 = new MyThread3("线程B");
		
		
		
		Thread t1 = new Thread(my1);
//		Thread t2 = new Thread(my2);
		
		t1.start();
		t1.start();//两个start()出现错误
//		
//		new Thread(my1).start();
//		new Thread(my1).start();//这时使用两个start()却没有错误？？

	}
}
