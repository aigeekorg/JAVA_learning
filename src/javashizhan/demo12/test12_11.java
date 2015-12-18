package javashizhan.demo12;


import java.io.File;
/**
 * 该类用于列出一个目录中的全部文件，如果有目录，则循环递归调用
 * @author yaokun
 *
 */
public class test12_11 {
	public static void main(String[] args) {
		File my = new File("d:"+File.separator+"360Downloads");//操作路径
		print(my);
	}
	public static void print(File file) {
		if(file != null){
			if(file.isDirectory()){
				File f[] = file.listFiles();
				if(f != null){
					for(int i=0;i<f.length;i++){
						print(f[i]);//继续列出内容
					}
				}
			}else {
			System.out.println(file);//如果不是目录，则直接打印路径信息
		}
		}
	}
}
