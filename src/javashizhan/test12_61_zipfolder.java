package javashizhan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
//ע�⣬����ֻ������ѹ���ļ��������ļ��е����
//������ʱ���о����Եݹ�ʵ��ѹ���ļ��еķ���
public class test12_61_zipfolder {
	public static void main(String[] args) throws Exception {
		File file = new File("D:"+File.separator+"testa");//Ҫѹ�����ļ�����
		File zipFile= new File("D:"+File.separator+"testadir.zip");//ѹ���ļ�������
		InputStream input = null;//�����ļ�������
		ZipOutputStream zipOut = null;//����ѹ�������
		zipOut = new ZipOutputStream(new FileOutputStream(zipFile));//ʵ����ѹ�������
		zipOut.setComment("www.aigeek.org");
		if(file.isDirectory()){
			File list[] = file.listFiles();
			for(int i = 0; i<list.length;i++){
				input = new FileInputStream(list[i]);//�����ļ�������

				//����ZipEntry
				//ÿһ����ѹ�����ļ�����ZipEntry����ʾ����ҪΪÿһ��ѹ������ļ���������
				ZipEntry entry = new ZipEntry(file.getName()+File.separator+list[i].getName());
				//�������������Ŀ����ѹ���ļ���
				zipOut.putNextEntry(entry);
				int temp = 0;
				while((temp = input.read())!=-1){//��ȡ����
					zipOut.write(temp);//ѹ���������
				}
				input.close();//�ر�������
			}
		}
		zipOut.close();//�ر�ѹ�������
	}
}
