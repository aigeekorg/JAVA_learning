package javashizhan;

class Array{
	private int temp[];
	private int foot;
	public Array(int len){
		if(len>0){
			this.temp = new int[len];
		}else{
			this.temp = new int[1];
		}
	}
	public boolean add(int i){
		if(this.foot < this.temp.length){
			this.temp[foot] = i;
			foot ++;
			return true;
		}else{
			return false;
		}
	}
	public int[] getArray(){
		return this.temp;
	}
	public void showFoot(){
		System.out.println(foot);
	}
}

public class test6_14 {
	public static void main(String[] args) {
		Array a = new Array(5);
		System.out.println(a.add(23)+"\t");//foot是对象a中的foot，所以可以保存不变
		a.showFoot();
		System.out.println(a.add(21)+"\t");
		a.showFoot();
		System.out.println(a.add(2)+"\t");
		a.showFoot();
		print(a.getArray());
	}
	
	public static void print(int i[]){
		for(int x=0; x<i.length;x++){
			System.out.println(i[x]+"、");
		}
	}
}
