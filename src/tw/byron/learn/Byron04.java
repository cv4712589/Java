package tw.byron.learn;

public class Byron04 {

	public static void main(String[] args) {
		double temp = Math.random();
		//System.out.println(temp);
		int score = (int)(temp * 101);
		if(score >= 90) {
			System.out.printf("%d : %s", score,"A");
		}else  if(score >= 80) {
			System.out.printf("%d : %s", score, "B");
		} else if (score >= 70) {
			System.out.printf("%d : %s", score, "C");
		} else if (score >= 60) {
			System.out.printf("%d : %s", score, "D");
		} else if (score >= 60) {
			System.out.printf("%d : %s", score, "GG");
			}
		}
	}
//                 ctrl+shift+f = 快速縮排
		
	

