package tw.byron.learn;

public class Byron07 {

	public static void main(String[] args) {
		// loop
		
		//      step1  step2   step4
		for(int a = 0; a < 10 ; a++ ) {
			System.out.println(a);   //step3
		}
	
		System.out.println("-----**-----");
		
		int a = 0;
		for( printB() ; a < 10 ; printLine()) {
			System.out.println(a++);  //會先印出a才會++
		}
		
	}

	
	static void printB() {           //static方法
		System.out.println("B");
	}
	static void printLine() {
		System.out.println("-----");
	}
	
	
	
	
}
