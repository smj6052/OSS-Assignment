package Chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex03AnonymousClassListener extends JFrame {
	public Ex03AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		//익명 클래스로 ActionListener 작성
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				setTitle(b.getText());
			}
		});
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03AnonymousClassListener();
	}
}
