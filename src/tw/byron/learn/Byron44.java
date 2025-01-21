package tw.byron.learn;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import tw.byron.classes.Student;

public class Byron44 {

	public static void main(String[] args) {
		Student s1 = new Student(86, 45, 67);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		
		Student s2 = new Student(87, 47, 37);
		System.out.println(s2.sum());
		System.out.println(s2.avg());

		try {
			ObjectOutputStream oout = new ObjectOutputStream(
				new BufferedOutputStream(
					new FileOutputStream("dir1/s1.byron")));
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}