package javashizhan;

import java.io.File;
import java.io.IOException;

public class test12_6 {
	public static void main(String[] args) {
		File f = new File("D:"+File.separator+"test.txt");//�ļ�·��
		File folder = new File("D:"+File.separator+"test");//�ļ���·��
		folder.mkdir();

		if(f.exists()){
			f.delete();
		}
		
		else{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
