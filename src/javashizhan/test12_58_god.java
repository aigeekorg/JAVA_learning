package javashizhan;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//虽然test12_57_wrong输出的是乱码，但是！这里竟然可以还原！！god！
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
				while((c=dis.readChar())!='\t'){//读取字符
					temp[len] = c;//接收内容
					len++;//读取长度加1
				}
				name = new String(temp,0,len);//将字符数组变为String
				price = dis.readFloat();//读取float
				dis.readChar();//读取/t
				num = dis.readInt();//读取int
				dis.readChar();//读取/n
				//格式控制符m.n，m表示输出数据宽度，n表示数据精度，具体因数据类型而不同,5.2即5表示输出数据宽度（数字+小数点+空格），2表示数据精度
				/*
				 * 关于数据宽度：http://zhidao.baidu.com/link?url=sHofhDOzf55PPj2nqPdGvLzAsmoEER_
				 * AmO9H2xEbIkjBBqMuQgRxTKyOAt3lYnhhpMXsHwmek_KPDHfaME852eOvFvVRZAyjuVecWZngAk_
				 * 数据宽度  含正负号，含小数点，含数字。
					宽度 不够实际数据需要时，按实际需要占位。
					宽度 大于 实际数据需要时，添空格。
					如：%6.2f   
					宽度6，
					数字70.00 实际数据需要5位，
					添1个空格
					凑到6
				 */
				System.out.printf("名称：%s;价格：%5.2f;数量：%d\n", name,price,num);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		dis.close();
	}
}
