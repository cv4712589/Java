package tw.byron.learn;

public class Byron20 {
	public static void main(String[] args) {
		Byron201 obj1 = new Byron201(2);
		System.out.println(obj1.toString());
		Byron202 obj2 = new Byron202();
		
	}
}

class Byron201 {
	Byron201(int a){
		System.out.println("Byron201()");
	}
}
class Byron202 extends Byron201 {
	Byron202(){
		super(3);
		System.out.println("Byron202()");
	}
}