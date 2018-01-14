package corejava;

class StaticClass {
	static {
		System.out.println("hello static pafrent");
	}
	private static int i = 10;
	int lo = 11;

	public static void getIVal() {
		System.out.println(i);
	}

	public void same() {
		System.out.println("hello 222 ");
	}

}

class StaticClass_Sub extends StaticClass {
	static {
		System.out.println("hello sub");
	}
	public static void getIVal() {
		System.out.println("hello");
	}
}

public class StaticTest {
	static {
		System.out.println("hello main");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticClass class1 = new StaticClass_Sub();
		StaticClass class2 = null;
		//class1.getIVal(); // will give 10 cause static only with class not with
		class2.getIVal(); // object
	}

}
