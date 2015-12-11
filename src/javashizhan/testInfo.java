package javashizhan;

class testInfo <T>{
	private T var;					//此变量类型由外部决定
	public T getVar(){				//返回值类型由外部决定
		return var;
	}
	public void setVar(T var){		//设置的类型由外部决定
		this.var = var;
	}
	public String toString(){		//覆写object类的toString()方法
		return this.var.toString();
	}
}
