package tw.byron.learn;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Byron54 {

	public static void main(String[] args) {
		String mesg = "Hello, ByronVVVVVVVV";
		byte[] data = mesg.getBytes();
		try (DatagramSocket socket = new DatagramSocket()) {
			
			DatagramPacket packet = new DatagramPacket(data, data.length, 
				InetAddress.getByName("10.0.104.255"), 8888);
			socket.send(packet);
			
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}