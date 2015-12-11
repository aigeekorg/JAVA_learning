package javashizhan;

class Math1{
	public int div(int i,int j) throws Exception{
		int temp = i/j;
		return temp;
	}
}
public class test7_11 {
	public static void main(String[] args) {
		Math1 m = new Math1();
		try {
			System.out.println("div operation = "+m.div(10, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("≤‚ ‘ø…∑ÒºÃ–¯÷¥––");
	}
}
