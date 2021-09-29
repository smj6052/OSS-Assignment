package Chap4;

public class Circle3 {
	int radius;
	String name;
	
	//생성자이름 == 클래스 이름
	public Circle3() {	// 원의 매개 변수 없는 생성자
		radius=1;
		name="";		// 리턴 타입 없음
	}
	public Circle3(int r, String n) {	// 원의 매개 변수 있는 생성자
		radius=r;
		name=n;		// 생성자 리턴 타입 없음
	}
	public double getArea() { 	//원 넓이 계산
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle3 pizza;
		pizza = new Circle3(); // 객체 생성
		pizza.radius = 10; // 반지름 10
		pizza.name = "자바피자"; // 피자의 이름
		double area = pizza.getArea(); // 피자의 면적
		System.out.println(pizza.name + "의 면적은 " + area);	// 출력
		
		Circle3 donut = new Circle3(); // Circle 객체 생성
		donut.name = "도넛피자"; // 도넛의 이름
		area = donut.getArea(); // 도넛의 면적
		System.out.println(donut.name + "의 면적은 " + area);	// 출력

	}
}
