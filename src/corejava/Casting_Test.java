package corejava;

class Animal {
	void m1() {
		System.out.println("m1 of animal"); // whherther you override or not it
											// is there
	}
}

class Dog extends Animal {
	@Override
	void m1() {
		System.out.println("m1 of dog"); // if i comment this then it will call
											// super's method
	}
}

public class Casting_Test {
	public static void main(String[] args) {
		// Animal animal = ; // Maybe a Dog? Maybe a Cat? Maybe an Animal?
		if (getAnimal() instanceof Dog) {
			// Guaranteed to succeed, barring classloader shenanigans
			Dog castedDog = (Dog) getAnimal();
			System.out.println(castedDog);
		} else {
			System.out.println("no can't cast");
		}

		Animal a = new Dog();
		a.m1();
		Animal d = new Dog();
		((Animal) d).m1(); // if nahi hai to super ka execute hoga
		((Dog) d).m1(); // no issue because it is basically dog object
		System.out.println();

	}

	private static Object getAnimal() {
		return new Animal();
	}
}
