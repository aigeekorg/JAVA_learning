package javashizhan;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class test12_66 {
	public static void main(String[] args) throws Exception {
		String str = "www.aigeek.org";
		PushbackInputStream push = null;
		ByteArrayInputStream bai = null;
		bai = new ByteArrayInputStream(str.getBytes());
		push = new PushbackInputStream(bai);
		System.out.println("��ȡ�������Ϊ��");
		int temp = 0;
		while((temp = push.read())!=-1){
			if(temp == '.'){
				push.unread(temp);
				temp = push.read();
				System.out.print("���˻�"+(char)temp+"��");
			}
			else {
				System.out.print((char)temp);
			}
		}
	}
}
