package tw.byron.learn;

import tw.byron.classes.Bike;
import tw.byron.classes.moto;

public class Byron15 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		moto s1 = new moto();
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());
		
		for(int i=0; i<11 ; i++) {
			s1.upSpeed();
		}
		
		System.out.println("-------");
		System.out.println(s1.getSpeed());
		
	}

}
