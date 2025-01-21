package tw.byron.learn;

public class Byron22 {
	public static void main(String[] args) {
		Byron221 obj1 = new Byron221();
		Byron221 obj2 = new Byron222();
		Byron222 obj3 = new Byron222();
		Byron222 obj4 = (Byron222)obj2;
		obj4.m2();
		if (obj3 instanceof Byron221) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		//Byron222 obj5 = (Byron222)obj1;
	}
}

		//介面可以實作多個，繼承只能單一繼承

class Byron221 {
	void m1() {System.out.println("Byron221:m1()");}
}
class Byron222 extends Byron221 {
	void m1() {System.out.println("Byron222:m1()");}	
	void m2() {System.out.println("Byron222:m2()");}	
}
class Byron223 extends Byron221 {
	void m1() {System.out.println("Byron223:m1()");}	
	void m2() {System.out.println("Byron223:m2()");}	
	void m3() {System.out.println("Byron223:m3()");}	
}