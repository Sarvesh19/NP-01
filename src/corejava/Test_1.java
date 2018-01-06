package corejava;

import java.math.BigDecimal;

public class Test_1 {
	public static void main(String[] args) {
		BigDecimal _a = new BigDecimal("0.02");
		BigDecimal _b = new BigDecimal("0.03");
		BigDecimal _c = _b.add(_a);
		System.out.println(_c);

		byte b = -128;
		long l = (long) b;
		long l1 = 1452200425;
		System.out.println(l);

		System.out.println(new String("14"));
		System.out.println((short)l1); //here it can cast no worry
		
		//A a = new C();
		C.main(null);
	}
}

class A {

}

class B extends A {

}

class C extends B {

	public static void main(String[] args) {
		B b = new B();
		System.out.println((C) b); // child cant hold parent ref
	}
}
