package tw.byron.learn;

import tw.byron.classes.moto;

public class Byron16 {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {97, 98, 99, 100};
		String s2 = new String(b1);
		String s3 = new String(b1, 1, 2);
		moto s4 = new moto();
		System.out.println(s4);   
		//印出記憶體位置，override改寫後會改變
		System.out.println(b1);   
		System.out.println(s1);
		System.out.println(s3);
	}

}
