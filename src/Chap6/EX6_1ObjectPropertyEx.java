package Chap6;
class Point1 {
	int x, y;
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class EX6_1ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // Ŭ���� �̸�
		System.out.println(obj.hashCode()); // �ؽ� �ڵ� ��
		System.out.println(obj.toString()); // ��ü�� ���ڿ��� ����� ���
		System.out.println(obj); // ��ü ���
	}
	public static void main(String [] args) {
		Point1 p = new Point1(2,3);
		print(p);
	}
}
