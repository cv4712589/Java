package tw.byron.learn;

import tw.byron.classes.Byron211;
import tw.byron.classes.Byron21c;

public class Byron23 {
	public static void main(String[] args) {
		Byron231 obj1 = new Byron231();
		Byron211 obj2 = new Byron231();
		Byron21c obj3 = new Byron231();
		obj2.m1();
	}
}


	//介面可以實作多個，繼承只能單一繼承
class Byron231 implements Byron211, Byron21c {
	public void m1() {}
	public void m2() {}
	public void m2(int a) {}
}
