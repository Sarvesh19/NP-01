package corejava;

public class PlusOperatorTest {
	public static void main(String[] args) {
		byte a = 127;
		byte b = 127;
		//b = a + b; // error : cannot convert from int to byte b += a; // ok
		System.out.println(b += a);;
		
		double d = 140000000;
		int i = (int) d;
		System.out.println(i);
	}
}
