package tw.byron.learn;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Byron25 extends JFrame{
	public Byron25() {
		super("Byron2555");
		
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		add(panel,BorderLayout.CENTER);
		
		MyMouseListener listener = new MyMouseListener();
		panel.addMouseListener(listener);
		panel.addMouseMotionListener(listener);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Byron25();
	}

}

class MyMouseListener extends MouseAdapter{
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX() + " ," + e.getY());
	}
}

