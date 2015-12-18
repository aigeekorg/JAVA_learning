package javashizhan.demo10;

class person10_41 <T extends Info10_38>{
	private T Info10_38;
	
	public person10_41(T Info10_38){
		this.setInfo(Info10_38);
	}
	public T getInfo(){
		return Info10_38;
	}
	public void setInfo(T Info10_38){
		this.Info10_38 = Info10_38;
	}
	public String toString(){
		return this.Info10_38.toString();
	}
}
