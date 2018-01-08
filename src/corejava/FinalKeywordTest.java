package corejava;

class Company {
	private static int count = 0; // if i make normal then

	void m1() throws Exception {
		System.out.println("hello m1 of parent");
		count++;
		if (count > 1) {
			mu();
			throw new Exception("m1 got exception");

		}
	}

	static void mu() {
		System.out.println("static method called");
	}
}

class Infy extends Company {
	private void m1(String... s) {

	}

	@Override
	void m1() {

	}
}

public class FinalKeywordTest {
	static {
		Company c = new Company();
		try {
			c.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Company c = new Company();
		try {
			c.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
