package corejava;
interface temp {
	void m1();
}
enum Animals implements temp{
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;

	Animals(String s) {
		sound = s;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}

class TestEnum {
	static Animals a;

	public static void main(String[] args) {
		//Animals a = new Animals();
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
		a.m1();
	}
}