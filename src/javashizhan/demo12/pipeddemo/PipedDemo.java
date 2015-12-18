package javashizhan.demo12.pipeddemo;
//管道流实例，用于两个线程的通信
//分别写好两个输出和输入的管道流线程，在操作时只需使用PipedOutputStream类提供的connect()方法就可以将两个线程连接在一起，
//再分别启动两个线程，在线程启动后会自动进行管道的输入和输出操作
//demo 12.33
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable{				//实现Runnable接口
	private PipedOutputStream pos = null;	//管道输出流
	public Send(){
		this.pos = new PipedOutputStream();//实例化输出口流
	}
	public void run(){
		String str = "Hello World! @From the first thread";
		try {
			this.pos.write(str.getBytes());//输出信息
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			this.pos.close();				//关闭输出流
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public PipedOutputStream getPos(){
		return pos;
	}
}





class Receive implements Runnable{//实现Runnable接口
	private PipedInputStream pis = null;//管道输入流
	public Receive(){
		this.pis = new PipedInputStream();//实例化输入流
	}
	public void run(){
		byte b[] = new byte[1024];
		int len = 0;
		try {
			len = this.pis.read(b);//接收数据
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			this.pis.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("接收的内容为："+new String(b,0,len));
	}
	public PipedInputStream getPis(){
		return pis;
	}
}



public class PipedDemo{
	public static void main(String[] args) {
		Send s = new Send();
		Receive r = new Receive();
		try {
			s.getPos().connect(r.getPis());//连接管道
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		new Thread(s).start();
		new Thread(r).start();
	}
}