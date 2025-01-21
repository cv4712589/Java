package tw.byron.learn;

public class Byron51 {

	public static void main(String[] args) {
		Byron511 obj1 = new Byron511();
		Byron512 obj2 = new Byron512();
		obj1.setDaemon(true);
		obj2.setDaemon(true);
		obj1.start();
		obj2.start();
		System.out.println("main");
	}

}

class Byron511 extends Thread {
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println("A:" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}
}
class Byron512 extends Thread {
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("B:" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}
}