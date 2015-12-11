package javashizhan;

class testInfo2<T extends Number> {		//此处泛型只能是数字类型，因为上限是Number
	private T var;						//此处变量类型由外部决定
	
	public T getvar(){					//返回值的类型由外部决定
		return var;
	}
	public void setVar(T var){			//设置的类型由外部决定
		this.var = var;
	}
	public String toString(){			//覆写Object类中的toString方法
		return this.var.toString();
	}
}
