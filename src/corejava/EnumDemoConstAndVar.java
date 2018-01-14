package corejava;

enum Apple {
	A, B(9), C(12), D(15), E(8);

	private int price; // price of each apple

	Apple() {
		System.out.println("default constructor called");
	}

	// Constructor
	Apple(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

public class EnumDemoConstAndVar {
	public static void main(String args[]) {
		Integer i = 10;
		Apple ap;
		System.out.println(Apple.A); //  this time all constructor get initiated
		// Display price of Winsap.
		System.out.println(Apple.A.getPrice());
		System.out.println(Apple.B.getPrice());

		// Display all apples and prices.
		System.out.println("All apple prices:");
		for (Apple a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");
	}
}