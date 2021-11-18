package Chap10;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Ex01IndepClassListener extends JFrame {
	public Ex01IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // MyActionL 달기
		c.add(btn);
		setSize(350, 150);
		setVisible(true); 
	}
	public static void main(String [] args) {
		new Ex01IndepClassListener();
	}
}

