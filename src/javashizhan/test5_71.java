package javashizhan;


class Check{
	public boolean validate(String name, String password){
		if(name.equals("yaokun")		
				&&password.equals("1")){
			System.out.println("welcome"+name+"!");
			return true;
		}else{
			return false;
		}
	}
}

class Operate{
	private String info[];
	
	public Operate(String info[]){
		this.info = info;
	}
	
	public String login(){
		Check check = new Check();
		this.isExit();
		
		String name = this.info[0];
		String password = this.info[1];
		
		String str = null;
		if(check.validate(name, password)){
			str = "welcome"+name+"!";
		}else{
			str = "wrong";
		}
		return str;
	}
	
	public void isExit(){
		if(this.info.length!=2){
			System.out.println("����Ĳ�������ȷ��ϵͳ�˳���");
			System.out.println("��ʽ��java LoginDemo01 �û��� ����");
			System.exit(1);
		}
	}
}

public class test5_71 {
	public static void main(String[] args) {
		Operate oper = new Operate(args);
		System.out.println(oper.login());//��ȡ��֤��Ϣ
	}
}
