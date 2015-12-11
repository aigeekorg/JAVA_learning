package javashizhan.demo12.pipeddemo;
//�ܵ���ʵ�������������̵߳�ͨ��
//�ֱ�д���������������Ĺܵ����̣߳��ڲ���ʱֻ��ʹ��PipedOutputStream���ṩ��connect()�����Ϳ��Խ������߳�������һ��
//�ٷֱ����������̣߳����߳���������Զ����йܵ���������������
//demo 12.33
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable{				//ʵ��Runnable�ӿ�
	private PipedOutputStream pos = null;	//�ܵ������
	public Send(){
		this.pos = new PipedOutputStream();//ʵ�����������
	}
	public void run(){
		String str = "Hello World! @From the first thread";
		try {
			this.pos.write(str.getBytes());//�����Ϣ
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			this.pos.close();				//�ر������
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public PipedOutputStream getPos(){
		return pos;
	}
}





class Receive implements Runnable{//ʵ��Runnable�ӿ�
	private PipedInputStream pis = null;//�ܵ�������
	public Receive(){
		this.pis = new PipedInputStream();//ʵ����������
	}
	public void run(){
		byte b[] = new byte[1024];
		int len = 0;
		try {
			len = this.pis.read(b);//��������
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
		System.out.println("���յ�����Ϊ��"+new String(b,0,len));
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
			s.getPos().connect(r.getPis());//���ӹܵ�
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		new Thread(s).start();
		new Thread(r).start();
	}
}