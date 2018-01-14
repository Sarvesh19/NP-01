package corejava;

public class IsWrapperFinal {
	public static void main(String[] args) {
		String n="15";
		
		Integer i = new Integer(n);
		int j = 42;
		j = 46;
		n = "54";
		System.out.println(i);
		modify(i,j);
		System.out.println(i + " " +j);
		IsWrapperFinal final1 = new IsWrapperFinal();
		//final1.
	}

	private static void modify(Integer i,int j) {
		i = i + 1;
		j = j+1;
	}
}
