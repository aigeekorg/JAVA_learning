package javashizhan.demo10;

public class test_chinese_length {

    public static void main(String[] args){
	    String str1="卿";
	    System.out.println(str1.length());
	    String str2="我";
	    System.out.println(str2.length());
	    String str3="的";
	    System.out.println(str3.length());
	    String str4="a";
	    System.out.println(str4.length());
	    String str5="abc";
	    System.out.println(str5.length());
	    String str6="你好";
	    System.out.println(str6.length());
    }
//.length()计算字符串长度，一个汉字长度为1，两个汉字为2，一个字母为1，两个字母为2
}
