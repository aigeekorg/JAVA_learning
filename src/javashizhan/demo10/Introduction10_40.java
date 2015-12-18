package javashizhan.demo10;

class Introduction10_40 implements Info10_38{//实现Info接口
	private String name;//姓名
	private String sex;//性别
	private String age;//年龄
	public Introduction10_40(String name, String sex, String age) {
		this.setName(name);
		this.setSex(sex);
		this.setAge (age);
	}
	public void setAge(String age) {//取年龄
		// TODO Auto-generated method stub
		this.age = age;
	}
	public void setSex(String sex) {//取性别
		// TODO Auto-generated method stub
		this.sex = sex;
	}
	public void setName(String name) {//取姓名
		// TODO Auto-generated method stub
		this.name = name;
	}
	public String getAge(){
		return age;
	}
	public String getSex(){
		return sex;
	}
	public String getName(){
		return name;
	}
	public String toString() {
		return "个人信息："+"\n"+
	"\t|-联系性别："+this.sex+"\n"+
	"\t|-联系姓名："+this.name+"\n"+
	"\t|-联系年龄："+this.age;//返回对象信息
				
	}
}
