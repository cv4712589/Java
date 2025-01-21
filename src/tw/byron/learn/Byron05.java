package tw.byron.learn;

public class Byron05 {

	public static void main(String[] args) {
		int year = 1996;
		//teacher 
		if(year % 4 ==0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					//閏年
				}else {
					//平年
				}
			}else {
				//閏年
			}
		}else {
			//平年
		}
		
//		if((year % 4 ==0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println("閏年");
//		}else {
//			System.out.println("平年");
//		}
	}
}
