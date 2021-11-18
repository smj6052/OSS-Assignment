package Chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex03AnonymousClassListener extends JFrame {
	public Ex03AnonymousClassListener() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		//�͸� Ŭ������ ActionListener �ۼ�
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
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
