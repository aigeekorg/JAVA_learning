package biaoshijiekou;

public class Hunter {
	public void fire(Object target) {
		if (target instanceof Humans) {
			System.out.println("这下完了，打中了一个人，该去坐牢了！");
		} else {
			System.out.println("恭喜你，打中了一只动物!");
		}
	}

	// 智能的枪
	public void intelligentFire(Object target) {
		if (target instanceof Humans) {
			return;
		}
		System.out.println("开了一枪!" + target.getClass());
		// 下面进行秒杀等相关处理
		// 销毁他
		target = null;
	}

	public static void main(String[] args) {
		Hunter hunter = new Hunter();
		System.out.println(new SomeThing() {});//为什么new SomeThing() {}会成为一个hunter$1???
		Object[] objects = new Object[] { new Dog(), new Japanese(),
				new Japanese(), new Chinese(), new Monster(), new SomeThing() {
				} };
		for (int i = 0; i < objects.length; i++){
//			hunter.fire(objects[i]);
			hunter.intelligentFire(objects[i]);	
		}
		System.out.println(objects[objects.length-2]);		
		System.out.println(objects[objects.length-1]);
	}
}