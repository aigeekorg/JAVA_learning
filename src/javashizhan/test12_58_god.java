package javashizhan;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//��Ȼtest12_57_wrong����������룬���ǣ����ﾹȻ���Ի�ԭ����god��
public class test12_58_god {
	public static void main(String[] args) throws Exception {
		DataInputStream dis = null;
		File  f = new File("D:"+File.separator+"order.txt");
		dis = new DataInputStream(new FileInputStream(f));
		String name = null;
		float price = 0.0f;
		int num = 0;
		char temp[] = null;
		char c = 0;
		int len = 0;
		try {
			while(true){
				temp = new char[200];
				len = 0;
				while((c=dis.readChar())!='\t'){//��ȡ�ַ�
					temp[len] = c;//��������
					len++;//��ȡ���ȼ�1
				}
				name = new String(temp,0,len);//���ַ������ΪString
				price = dis.readFloat();//��ȡfloat
				dis.readChar();//��ȡ/t
				num = dis.readInt();//��ȡint
				dis.readChar();//��ȡ/n
				//��ʽ���Ʒ�m.n��m��ʾ������ݿ�ȣ�n��ʾ���ݾ��ȣ��������������Ͷ���ͬ,5.2��5��ʾ������ݿ�ȣ�����+С����+�ո񣩣�2��ʾ���ݾ���
				/*
				 * �������ݿ�ȣ�http://zhidao.baidu.com/link?url=sHofhDOzf55PPj2nqPdGvLzAsmoEER_
				 * AmO9H2xEbIkjBBqMuQgRxTKyOAt3lYnhhpMXsHwmek_KPDHfaME852eOvFvVRZAyjuVecWZngAk_
				 * ���ݿ��  �������ţ���С���㣬�����֡�
					��� ����ʵ��������Ҫʱ����ʵ����Ҫռλ��
					��� ���� ʵ��������Ҫʱ����ո�
					�磺%6.2f   
					���6��
					����70.00 ʵ��������Ҫ5λ��
					��1���ո�
					�յ�6
				 */
				System.out.printf("���ƣ�%s;�۸�%5.2f;������%d\n", name,price,num);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		dis.close();
	}
}
