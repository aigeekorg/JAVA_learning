package javashizhan.demo12.person_info_manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputData {
	private BufferedReader buf = null;
	public InputData(){
		this.buf = new BufferedReader(new InputStreamReader(System.in));
	}
	public String getString(String info) {//从此方法中得到字符串的信息
		String temp = null;
		System.out.print(info);
		try {
			temp = this.buf.readLine();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return temp;
	}
	
	
	public int getInt(String info,String err) {//得到一个整数的输入数据
		int temp = 0;
		String str = null;
		boolean flag = true;
		while(flag){
			str = this.getString(info);
			if (str.matches("^\\d+$")) {//判断输入的是否是数字
				temp = Integer.parseInt(str);
				flag = false;
			}else {
				System.out.println(err);
			}
		}
		return temp;
	}
	
	public float getFloat(String info,String err) {//得到一个小数的输入数据
		float temp = 0;
		String str = null;
		boolean flag = true;
		while(flag){
			str = this.getString(info);
			if(str.matches("^\\d+.?\\d+$")){
				temp = Float.parseFloat(str);
				flag = false;
			}
			else {
				System.out.println(err);
			}
		}
		return temp;
	}
	
	
	public Date getDate(String info,String err) {//得到一个日期的数据
		Date d = null;
		String str = null;
		boolean flag = true;
		while(flag){
			str = this.getString(info);
			if(str.matches("^\\d{4}-\\d{2}-\\d{2}$")){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");//"yyyy-MM-dd"
				try {
					d = sdf.parse(str);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				flag = false;
			}else {
				System.out.println(err);
			}
		}
		return d;
	}
	
	
	
}
