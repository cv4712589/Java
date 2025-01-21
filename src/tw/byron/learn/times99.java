package tw.byron.learn;

public class times99 {

	public static void main(String[] args) {
		
		for(int k = 0; k < 2; k++ ) {
			for(int j = 1; j < 10; j++) {
				for(int i = 2; i < 6; i++ ) {
					int n = i * j;
					int m = k * 4 + i ;
					System.out.printf("%d x %d = %d\t", m, j, n);
				}
				System.out.println();
			}
			System.out.println("------------------");
		}
		
	}

}
