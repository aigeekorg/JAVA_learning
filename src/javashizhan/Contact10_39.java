package javashizhan;

class Contact10_39 implements Info10_38{//实现Info接口
	private String address;//地址
	private String telephone;//电话
	private String zipcode;//邮编
	public Contact10_39(String address, String telephone, String zipcode) {
		this.setAddress(address);
		this.settelephone(telephone);
		this.setZipcode (zipcode);
	}
	public void setZipcode(String zipcode) {//取邮编
		// TODO Auto-generated method stub
		this.zipcode = zipcode;
	}
	public void settelephone(String telephone) {//取电话
		// TODO Auto-generated method stub
		this.telephone = telephone;
	}
	public void setAddress(String address) {//取地址
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
		return "联系方式："+"\n"+
	"\t|-联系电话："+this.telephone+"\n"+
	"\t|-联系地址："+this.address+"\n"+
	"\t|-联系邮编："+this.zipcode;//返回对象信息
				
	}
}
