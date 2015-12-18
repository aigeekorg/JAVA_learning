package javashizhan.demo12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
//注意，此类只能用于压缩文件夹内无文件夹的情况
//后续有时间研究可以递归实现压缩文件夹的方法
public class test12_61_zipfolder {
	public static void main(String[] args) throws Exception {
		File file = new File("D:"+File.separator+"testa");//要压缩的文件名称
		File zipFile= new File("D:"+File.separator+"testadir.zip");//压缩文件的名称
		InputStream input = null;//定义文件输入流
		ZipOutputStream zipOut = null;//定义压缩输出流
		zipOut = new ZipOutputStream(new FileOutputStream(zipFile));//实例化压缩输出流
		zipOut.setComment("www.aigeek.org");
		if(file.isDirectory()){
			File list[] = file.listFiles();
			for(int i = 0; i<list.length;i++){
				input = new FileInputStream(list[i]);//设置文件输入流

				//创建ZipEntry
				//每一个被压缩的文件都用ZipEntry来表示，需要为每一个压缩后的文件设置名称
				ZipEntry entry = new ZipEntry(file.getName()+File.separator+list[i].getName());
				//并将创建后的条目放入压缩文件中
				zipOut.putNextEntry(entry);
				int temp = 0;
				while((temp = input.read())!=-1){//读取内容
					zipOut.write(temp);//压缩输出内容
				}
				input.close();//关闭输入流
			}
		}
		zipOut.close();//关闭压缩输出流
	}
}
