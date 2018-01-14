package corejava;

class _A {
	static void m1() {
		// no use even you can wrtite
		// because it doesnt depend on Object
		// It alaways look for which reference is assigned so it calls that
		// method than which object it holeds
		System.out.println("A's m1 static");
	}

	_A() {
		this(14);
		System.out.println("hello A's default constructor");
		// Calling one constructor from another
	}

	_A(int i) {
		// this(); not allowd recusrive call for constructor calling
		System.out.println("called _A parameterized " + i);
	}
}

class _B extends _A {
	static void m1() {
		// no use even you can wrtite
		System.out.println("B's m1 static");

	}

	void m1NonStatic() {
		super.m1();
	}

	_B() {
		super();
		System.out.println("hello B's default constructor");
	}
}

public class ConstructorTest {
	public static void main(String[] args) {

		_A a = new _B();
		_B b = new _B();
		b.m1NonStatic();
		a.m1();
	}

}
