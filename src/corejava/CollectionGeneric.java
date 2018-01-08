package corejava;

import java.util.ArrayList;
import java.util.List;

public class CollectionGeneric {

	static void getVal(String... s) {
		if (s.length > 0){
			for (int i = 0; i < s.length; i++) {
				System.out.print(s[i] + " ");

			}
		} else {
			System.out.println("\n without args called");
		}
	}

	public static void main(String[] args) {
		// List<int> list = new ArrayList<>();
		String[] slist = new String[] { "dw", "dwd", "ce", "wd", "ecec", "rr" };

		getVal(slist);
		getVal();
		getVal("sdv","sdv","sdvdsv");
	}
}
