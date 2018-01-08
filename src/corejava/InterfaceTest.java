package corejava;

interface Animal_Mass {
	int count = 10;

	void eating();
}

class Animal_Mass_class implements Animal_Mass {

	@Override
	public void eating() {
		int count1 = Integer.MIN_VALUE;
		count1 = count;
		System.out.println(count1 + 1);
		System.out.println(count);
		System.out.println("eating method implementation");
	}

}

public class InterfaceTest {
	public static void main(String[] args) {
		Animal_Mass a = new Animal_Mass_class();
		System.out.println(Animal_Mass.count);
		a.eating();

	}
}
