package Chap5;
//super class
class Point1 {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
	System.out.println("(" + x + "," + y + ")");
	}
}
//sub class
//Point�� ��ӹ��� ColorPoint ����
class ColorPoint1 extends Point1 {	//extends Ű���� ���
	private String color; // ���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}
public class Ex5_1ColorPoint {

	public static void main(String[] args) {
		Point1 p = new Point1(); // Point ��ü ����
		p.set(1, 2); // Point Ŭ������ set() ȣ��
		p.showPoint();
		
		ColorPoint1 cp = new ColorPoint1(); // ColorPoint ��ü
		cp.set(3, 4); // Point�� set() ȣ��
		cp.setColor("red"); // ColorPoint�� setColor() ȣ��
		cp.showColorPoint(); // �÷��� ��ǥ ���

	}

}
