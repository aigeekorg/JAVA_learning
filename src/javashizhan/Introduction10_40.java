package javashizhan;

class Introduction10_40 implements Info10_38{//ʵ��Info�ӿ�
	private String name;//����
	private String sex;//�Ա�
	private String age;//����
	public Introduction10_40(String name, String sex, String age) {
		this.setName(name);
		this.setSex(sex);
		this.setAge (age);
	}
	public void setAge(String age) {//ȡ����
		// TODO Auto-generated method stub
		this.age = age;
	}
	public void setSex(String sex) {//ȡ�Ա�
		// TODO Auto-generated method stub
		this.sex = sex;
	}
	public void setName(String name) {//ȡ����
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
		return "������Ϣ��"+"\n"+
	"\t|-��ϵ�Ա�"+this.sex+"\n"+
	"\t|-��ϵ������"+this.name+"\n"+
	"\t|-��ϵ���䣺"+this.age;//���ض�����Ϣ
				
	}
}
