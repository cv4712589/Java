package tw.byron.learn;

import java.util.Scanner;

public class Byron02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		int a = scanner.nextInt(); //讀取輸入的整數，並儲存到變數a
		System.out.print("b = ");
		int b = scanner.nextInt(); //讀取輸入的整數，並儲存到變數b
		
		int r = a + b;
		int t = a - b;
		int y = a * b;
		int u = a / b;
		int i = a % b;
		
		System.out.printf("%d + %d = %d\n", a, b, r);
		System.out.printf("%d - %d = %d\n", a, b, t);
		System.out.printf("%d * %d = %d\n", a, b, y);
		System.out.printf("%d / %d = %d\n", a, b, u);
		System.out.printf("%d / %d = %d......%d", a, b, u, i);
	}

}
