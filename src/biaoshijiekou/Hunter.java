package biaoshijiekou;

public class Hunter {
	public void fire(Object target) {
		if (target instanceof Humans) {
			System.out.println("�������ˣ�������һ���ˣ���ȥ�����ˣ�");
		} else {
			System.out.println("��ϲ�㣬������һֻ����!");
		}
	}

	// ���ܵ�ǹ
	public void intelligentFire(Object target) {
		if (target instanceof Humans) {
			return;
		}
		System.out.println("����һǹ!" + target.getClass());
		// ���������ɱ����ش���
		// ������
		target = null;
	}

	public static void main(String[] args) {
		Hunter hunter = new Hunter();
		System.out.println(new SomeThing() {});//Ϊʲônew SomeThing() {}���Ϊһ��hunter$1???
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