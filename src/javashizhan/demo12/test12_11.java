package javashizhan.demo12;


import java.io.File;
/**
 * ���������г�һ��Ŀ¼�е�ȫ���ļ��������Ŀ¼����ѭ���ݹ����
 * @author yaokun
 *
 */
public class test12_11 {
	public static void main(String[] args) {
		File my = new File("d:"+File.separator+"360Downloads");//����·��
		print(my);
	}
	public static void print(File file) {
		if(file != null){
			if(file.isDirectory()){
				File f[] = file.listFiles();
				if(f != null){
					for(int i=0;i<f.length;i++){
						print(f[i]);//�����г�����
					}
				}
			}else {
			System.out.println(file);//�������Ŀ¼����ֱ�Ӵ�ӡ·����Ϣ
		}
		}
	}
}
