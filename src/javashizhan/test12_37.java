package javashizhan;

public class test12_37 {
	public static void main(String[] args) {
		String  str = "hello";
		try {
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("err(注意颜色):"+e);
			System.out.println("out(注意颜色):"+e);
		}
	}
}
