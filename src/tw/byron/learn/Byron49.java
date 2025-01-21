package tw.byron.learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Byron49 {
	public static void main(String[] args) {
		Byron493 obj = new Byron493();
		
		try {
			ObjectOutputStream oout = new ObjectOutputStream(
				new FileOutputStream("dir1/tt"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("write ok");
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("----");
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/tt"));
			Byron493 tt = (Byron493)(oin.readObject());
			oin.close();
			System.out.println("read ok");
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}
}
class Byron491 {
	Byron491(){System.out.println("Byron491()");}
}
class Byron492 extends Byron491  implements Serializable{
	Byron492(){System.out.println("Byron492()");}
}
class Byron493 extends Byron492 {
	Byron493(){System.out.println("Byron493()");}
}