package javashizhan;

class Info<T, V>{					//指定两个泛型类型
	private T var;					//第一个泛型属性
	private V value;				//第二个泛型属性
	public Info (T var, V value){	//通过构造方法设置
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
