package corejava;

import java.io.*;

public class Write1 {
	public static void main(String[] args) {
		try { // warning: exceptions possible

			char[] in = new char[50]; // to store input
			int size = 0;
			
			
			
			boolean newFile = false;
			File file = new File // it's only an object
			("fileWrite1.txt");
			System.out.println(file.exists()); // look for a real file
			newFile = file.createNewFile(); // maybe create a file!
			System.out.println(newFile); // already there?
			System.out.println(file.exists()); // look again

			FileWriter fw = new FileWriter(file); // create an actual file
			// & a FileWriter obj
			fw.write("howdy\nfolks\n"); // write characters to
			// the file
			fw.flush(); // flush before closing
			fw.close();

			
			
			
			
			FileReader fr = new FileReader(file); // create a FileReader
			// object
			size = fr.read(in); // read the whole file!
			System.out.print(size + " "); // how many bytes read
			for (char c : in)
				// print the array
				System.out.print(c);
			fr.close();

		} catch (IOException e) {
		}
	}
}