package javashizhan;

class testInfo2<T extends Number> {		//�˴�����ֻ�����������ͣ���Ϊ������Number
	private T var;						//�˴������������ⲿ����
	
	public T getvar(){					//����ֵ���������ⲿ����
		return var;
	}
	public void setVar(T var){			//���õ��������ⲿ����
		this.var = var;
	}
	public String toString(){			//��дObject���е�toString����
		return this.var.toString();
	}
}
