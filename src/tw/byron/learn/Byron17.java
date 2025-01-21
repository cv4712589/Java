package tw.byron.learn;

public class Byron17 {

	public static void main(String[] args) {
		String s1 = "Byron";
		//雙引號-->是物件
		//看到雙引號就做出記憶體空間(String pool)
		//降低「字串重覆使用」時所消耗的資源
		System.out.println("Byron".charAt(2));
		String s2 = "Byron";
		String s3 = new String("Byron");
		String s4 = new String("Byron");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		System.out.println("-------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		//比字串內容用equals(肚子裡的東西一樣)
	}

}
