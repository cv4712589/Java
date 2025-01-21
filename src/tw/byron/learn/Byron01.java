package tw.byron.learn;

public class Byron01 {

	public static void main(String[] args) {
		// byte, short, int, long (正,負整數
		// byte 2^8 => 256 => -128 ~ 127 (0為高位元算正數)
		byte var1;  //[a-zA-Z$_][a-zA-Z$_]* (第一個字元)(第二個字元)(*可以0個或多個)
		// $_盡量不要用來當開頭，高機率跟jQuary打架
		byte $$$, $$_$$ = 123;
		System.out.println($$_$$);
		// 支援unicode
		byte 變數 = -1;
		System.out.println(變數);
		// 沒有初始化(宣告但是沒有給值)，給過值就完成初始化，就可存取
//		System.out.println(var1);  //報錯
		
		// short 2^16 => 65536 => -36768 ~ 36767
		// int 2^32 => 約42億.... =>10位數
		// long 2^64 
		
		byte var2 = 1, var3 = 2;
		int var4 = var2 + var3; //編譯出錯 所以byte改成int
		//只要有四則運算，byte, short, int範圍，會先法在int的區域
		//之後再放回byte
		
		byte a = 127;
		a++;
		System.out.println(a);
		// ++的運算不是四則運算原理，只是位元位移
		// 所以只會出現範圍內數字
		// 若a+=3  println(a)為 -126
		
		
		
		
	}

}
