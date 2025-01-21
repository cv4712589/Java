package tw.byron.learn;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Byron62 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://pdfmyurl.com/?url=https://www.gamer.com.tw");
			URLConnection conn = url.openConnection();
			
			try(BufferedInputStream bin = 
				new BufferedInputStream(
				conn.getInputStream());
				FileOutputStream fout = 
				new FileOutputStream("dir2/byron.pdf")
				){
				
				int len; byte[] buf = new byte[4*1024*1024];
				while ( (len = bin.read(buf)) != -1) {
					fout.write(buf, 0, len);
				}
				
				fout.flush();
				System.out.println("OK");
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}