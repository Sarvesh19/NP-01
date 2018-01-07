package corejava;

final class ImmutableClass {
	private final int i;
	private final String s;

	ImmutableClass(int i, String s) {
		this.i = i;
		this.s = s;
	}

	void getIS() {
		System.out.println(i + "  " + s);
	}
	void setIS(int i, String s){
		//this.i = i;  we cant
		
	}

}

public class ImmutableClassTest {
	public static void main(String[] args) {
		ImmutableClass im = new ImmutableClass(20, "sarvesh");
		im.getIS();
		im.setIS(42,"dewdws");
		ImmutableClass im1 = new ImmutableClass(10, "sedd");
		im1.getIS();
	}
}
