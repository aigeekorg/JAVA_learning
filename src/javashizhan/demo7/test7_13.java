package javashizhan.demo7;

class Math3{
	public int div(int i,int j) throws Exception{
		System.out.println("*****计算开始*****");
		int temp = 0;
		try{
			temp = i/j;
		}catch(Exception e){
			throw e;//将异常抛出，结合throws该异常会被抛出到方法调用出
		}finally{//无论是否有异常都会执行此操作
			System.out.println("*****计算结束*****");
		}
		return temp;
	}
}

public class test7_13 {
	public static void main(String[] args) {
		Math3 m = new Math3();
		try{
			System.out.println("除法操作："+m.div(10,0));
		}catch(Exception e){
			System.out.println("异常产生："+e);
		}
	}
}
