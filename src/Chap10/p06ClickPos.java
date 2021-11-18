package Chap10;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p06ClickPos extends JFrame {
	p06ClickPos(){
		setTitle("클릭 연습용 응용프로그램"); // 제목 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c=getContentPane();
		c.setLayout(null);
		
		JLabel label= new JLabel("c");
		label.setSize(100,50);
		label.setLocation(100,100);
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x=(int)(Math.random()*c.getWidth());
				int y=(int)(Math.random()*c.getHeight());
				label.setLocation(x,y);
			}
		});
		
		add(label);
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new p06ClickPos();
	}
	
}
