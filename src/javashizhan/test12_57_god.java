package javashizhan;


//数据输出流，但是中文出现乱码？p461
//虽然本程序输出的是乱码，但是！test12_57_god竟然可以还原！！为什么！！god！
//注意，由于输出的是二进制文件所以会出现乱码，解决办法是，换用PrintWrite类即可
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class test12_57_god {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = null;
		File f = new File("D:"+File.separator+"order.txt");
		dos = new DataOutputStream(new FileOutputStream(f));
		String names[] = {"衬衫","手套","围巾"};
		float prices[]={98.3f,30.3f,50.5f};
		int nums[]={3,2,1};
		for (int i = 0; i < names.length; i++) {
			dos.writeChars(names[i]);
			dos.writeChar('\t');
			dos.writeFloat(prices[i]);
			dos.writeChar('\t');
			dos.writeInt(nums[i]);
			dos.writeChar('\n');
		}
		dos.close();
	}
}
