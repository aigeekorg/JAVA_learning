package javashizhan;

import javax.sound.midi.MidiDevice.Info;

class test10_33 {
	public static void main(String[] args) {
		testInfo<String> i1 = new testInfo<String>();//����StringΪ��������
		testInfo<String> i2 = new testInfo<String>();//����StringΪ��������
//		testInfo<String> i2 = new testInfo<Object>();//����StringΪ��������
		i1.setVar("HELLO��");//��������
		i2.setVar("yaokun��");//��������
		add(i1,i2);		
	}

	
	
	
	
	
	
	public static <T> void add(testInfo<T>i1,testInfo<T>i2) {
		System.out.println(i1.getVar()+""+i2.getVar());
	}
}
