package javashizhan;

class Contact10_39 implements Info10_38{//ʵ��Info�ӿ�
	private String address;//��ַ
	private String telephone;//�绰
	private String zipcode;//�ʱ�
	public Contact10_39(String address, String telephone, String zipcode) {
		this.setAddress(address);
		this.settelephone(telephone);
		this.setZipcode (zipcode);
	}
	public void setZipcode(String zipcode) {//ȡ�ʱ�
		// TODO Auto-generated method stub
		this.zipcode = zipcode;
	}
	public void settelephone(String telephone) {//ȡ�绰
		// TODO Auto-generated method stub
		this.telephone = telephone;
	}
	public void setAddress(String address) {//ȡ��ַ
		// TODO Auto-generated method stub
		this.address = address;
	}
	public String getZipcode(){
		return zipcode;
	}
	public String getTelephone(){
		return telephone;
	}
	public String GetAddress(){
		return address;
	}
	public String toString() {
		return "��ϵ��ʽ��"+"\n"+
	"\t|-��ϵ�绰��"+this.telephone+"\n"+
	"\t|-��ϵ��ַ��"+this.address+"\n"+
	"\t|-��ϵ�ʱࣺ"+this.zipcode;//���ض�����Ϣ
				
	}
}
