package javashizhan;

class Info<T, V>{					//ָ��������������
	private T var;					//��һ����������
	private V value;				//�ڶ�����������
	public Info (T var, V value){	//ͨ�����췽������
		this.setVar(var);
		this.setValue(value);
	}
	public T getVar(){
		return var;
	}
	public V getValue(){
		return value;
	}
	public void setVar(T var){
		this.var = var;
	}
	public void setValue(V value){
		this.value = value;
	}
}
class Demo<S>{
	private S info;
	public Demo(S info){
		this.setInfo(info);
	}
	public S gteInfo(){
		return info;
	}
	public void setInfo(S info){
		this.info = info;
	}
}
