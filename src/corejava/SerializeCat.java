package corejava;

import java.io.*;

class Cat implements Serializable {
	int i = 14;
	static int j = 10;
	transient int k = 101542;
	transient boolean b = true;
	
	// serialization applies only to OBJECTS
} // 1
//
public class SerializeCat {
	public static void main(String[] args) {
		Cat c = new Cat(); // 2
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c); // 3
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Cat) ois.readObject(); // 4
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}