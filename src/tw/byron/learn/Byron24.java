package tw.byron.learn;

import tw.byron.classes.Byron211;

public class Byron24 {
	public static void main(String[] args) {
		Byron241 obj1 = new Byron242();
		Byron241 obj2 = new Byron241() {
			@Override
			void m2() {
				
			}
		};
		Byron211 obj3= new Byron211() {
			@Override
			public void m1() {
				
			}
		};
	}
}
abstract class Byron241 {
	void m1() {}
	abstract void m2();
}
class Byron242 extends Byron241 {
	void m2() {}
}
class Byron243 extends Byron241 {
	void m2() {}
}