package javashizhan;

class testInfo <T>{
	private T var;					//�˱����������ⲿ����
	public T getVar(){				//����ֵ�������ⲿ����
		return var;
	}
	public void setVar(T var){		//���õ��������ⲿ����
		this.var = var;
	}
	public String toString(){		//��дobject���toString()����
		return this.var.toString();
	}
}
