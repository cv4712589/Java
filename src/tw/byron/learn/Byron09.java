package tw.byron.learn;

public class Byron09 {

	public static void main(String[] args) {
		//int p0, p1, p2, p3, p4, p5, p6;
		//p0 = p1 = p2 = p3 = p4 = p5 = p6 = 0;
		
		int p[] = new int [7];
		
		for(int i = 0; i < 100000000 ; i++ ) {
			int point = (int)(Math.random()*9) + 1; 
			//*6會出現0 ~ 5，所以需要 + 1變成 1 ~ 6
			if(point < 1 || point > 9) {
				p[0]++;
			}else {
//				p[point]++;
				p[point > 6 ? point - 3 : point]++;
			//  作弊	
			}
		}
		
		if (p[0] == 0) {
			for(int i = 1; i <= 6 ; i++ ) {
				System.out.printf("%d點出現%d次\n", i, p[i]);
			}
		}else {
			System.out.println("ERROR:" + p[0]);
		}
			
		}
	}

