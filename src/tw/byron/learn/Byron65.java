package tw.byron.learn;

import tw.byron.classes.BCrypt;

public class Byron65 {

	public static void main(String[] args) {
		String passwd = "123456";
		String hashPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(hashPasswd);
		
		String passwd2 = "123457";
		
		if (BCrypt.checkpw(passwd2, hashPasswd)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}

	}

}