package javashizhan;

import java.io.File;
import java.io.IOException;

public class test12_6 {
	public static void main(String[] args) {
		File f = new File("D:"+File.separator+"test.txt");//文件路径
		File folder = new File("D:"+File.separator+"test");//文件夹路径
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
