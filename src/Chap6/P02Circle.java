package Chap6;

public class P02Circle {
	private int x, y;		//중심
	private int radius;		//반지름
	public P02Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public String toString() {
		return ("Circle(" + x + "," + y + ")" + "반지름" + radius);
	}
	public boolean equals(Object obj) {
		P02Circle c = (P02Circle)obj; // 객체 obj를 다운 캐스팅
		if(x == c.x && y == c.y) return true;
		else return false;
	}

	public static void main(String[] args) {
		P02Circle a = new P02Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
		P02Circle b = new P02Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
