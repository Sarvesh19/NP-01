package corejava;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
	public static void main(String[] args) {
		Set<Object> s = new HashSet<>();
		s.add("Sarvesh");

		s.add("Parvesh");

		s.add("Larvesh");
		for (int i = 0; i < s.size(); i++) {
			if (s.add("sarvesh")) {
				System.out.println("sarvesh is added");
				
			} else {
				System.out.println("sarvesh alrdy there");
				
			}
		}

	}
}
