package Chap6;

public class P02Circle {
	private int x, y;		//�߽�
	private int radius;		//������
	public P02Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public String toString() {
		return ("Circle(" + x + "," + y + ")" + "������" + radius);
	}
	public boolean equals(Object obj) {
		P02Circle c = (P02Circle)obj; // ��ü obj�� �ٿ� ĳ����
		if(x == c.x && y == c.y) return true;
		else return false;
	}

	public static void main(String[] args) {
		P02Circle a = new P02Circle(2, 3, 5); // �߽� (2, 3)�� ������ 5�� ��
		P02Circle b = new P02Circle(2, 3, 30); // �߽� (2, 3)�� ������ 30�� ��
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}
