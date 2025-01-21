package tw.byron.learn;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Byron39 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir3/file2.txt");
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char)c);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}