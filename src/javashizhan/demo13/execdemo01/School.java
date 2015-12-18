package javashizhan.demo13.execdemo01;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	private List<Student> allStudents;
	public School(){								//无参构造函数
		this.allStudents = new ArrayList<Student>();
	}
	public School(String name){						//通过构造函数设置name属性
		this();										//调用无参构造函数
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getAllStudents() {			//取得全部学生
		return allStudents;
	}
	public String toString() {						//覆写toString()
		return "学校名称："+this.name;
	}

	
}
