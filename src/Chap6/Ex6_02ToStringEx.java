package Chap6;
class Point2 {
	int x, y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class Ex6_02ToStringEx {
	public static void main(String [] args) {
		Point2 p = new Point2(2,3);
		System.out.println(p.toString());
		System.out.println(p); // p�� p.toString()���� �ڵ� ��ȯ
		System.out.println(p + "�Դϴ�."); // p.toString() + "�Դϴ�"�� �ڵ� ��ȯ
		}
}
