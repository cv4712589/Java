package tw.byron.learn;

import tw.byron.classes.Bike;

public class Byron14 {
	
	//應用物件(設計好的父類別)
	public static void main(String[] args) {
		Bike b1 = new Bike();
		//Byyy b2 = new Byyy();  
		//沒有設計Byyy物件類別，沒有定義
		
		System.out.println(b1.getSpeed());  
		//不同package，Bike被宣告public，內部屬性看不到
		//內部加上public .speed才能被選擇(存取修飾字)
		//印出0.0(預設值)
		
		for(int i=0; i<11 ; i++) {
			b1.upSpeed();
		}

		System.out.println(b1.getSpeed());
		
		
	}

}
