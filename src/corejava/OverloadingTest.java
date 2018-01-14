package corejava;

class Toy {
	Toy running(int i) {
		return new Toy();
	}
}

class Lego extends Toy {
	// @Override
	void running(int i, float f) {

	}

	@Override
	Lego running(int i) {
		return new Lego();
	}
}

public class OverloadingTest {
	public static void main(String[] args) {

	}
}
