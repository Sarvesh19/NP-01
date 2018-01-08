package corejava;

public class StringTest {
	public static void main(String[] args) {
		String str = "sarvesh";
		String str1 = new String("sarvesh").intern();
		System.out.println(str == str1);
	}
}
