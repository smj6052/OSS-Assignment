package Chap10;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex07KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	public Ex07KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			Component c = (Component)e.getSource();
			if(e.getKeyChar() == '%')
				//contentPane.setBackground(Color.YELLOW);
				c.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				//contentPane.setBackground(Color.GREEN);
				c.setBackground(Color.GREEN);
		}
	}
	public static void main(String [] args) {
		new Ex07KeyCodeEx();
	}
}