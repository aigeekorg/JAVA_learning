package javashizhan;


//������������������ĳ������룿p461
//��Ȼ����������������룬���ǣ�test12_57_god��Ȼ���Ի�ԭ����Ϊʲô����god��
//ע�⣬����������Ƕ������ļ����Ի�������룬����취�ǣ�����PrintWrite�༴��
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class test12_57_god {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = null;
		File f = new File("D:"+File.separator+"order.txt");
		dos = new DataOutputStream(new FileOutputStream(f));
		String names[] = {"����","����","Χ��"};
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
