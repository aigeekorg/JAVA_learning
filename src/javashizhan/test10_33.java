package javashizhan;

import javax.sound.midi.MidiDevice.Info;

class test10_33 {
	public static void main(String[] args) {
		testInfo<String> i1 = new testInfo<String>();//设置String为泛型类型
		testInfo<String> i2 = new testInfo<String>();//设置String为泛型类型
//		testInfo<String> i2 = new testInfo<Object>();//设置String为泛型类型
		i1.setVar("HELLO！");//设置内容
		i2.setVar("yaokun！");//设置内容
		add(i1,i2);		
	}

	
	
	
	
	
	
	public static <T> void add(testInfo<T>i1,testInfo<T>i2) {
		System.out.println(i1.getVar()+""+i2.getVar());
	}
}
