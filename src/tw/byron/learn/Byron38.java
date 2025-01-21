package tw.byron.learn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Byron38 {

	public static void main(String[] args) {
		try {
			String mesg = "全世界\n";
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt", true);
			fout.write(mesg.getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}