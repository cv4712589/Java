package tw.byron.learn;

public class Byron50 {

	public static void main(String[] args) {
		Byron501 t1 = new Byron501("A");
		Byron501 t2 = new Byron501("B");
		Byron502 t3 = new Byron502("C");
		Thread t4 = new Thread(t3);
		t1.start(); t2.start();t4.start();
		System.out.println("main");
	}

}
class Byron501 extends Thread{
	String name;
	Byron501(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}
}

class Byron502 implements Runnable {
	String name;
	Byron502(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}
}


