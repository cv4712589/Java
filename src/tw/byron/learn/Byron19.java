package tw.byron.learn;

import tw.byron.classes.TWid;

public class Byron19 {

	public static void main(String[] args) {
		TWid myId = TWid.createTWId("A123456789");
		TWid id1 = new TWid();
		TWid id2 = new TWid(false);
		TWid id3 = new TWid(7);
		TWid id4 = new TWid(true, 1);
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		

	}

}
