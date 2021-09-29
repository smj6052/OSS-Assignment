package Chap4;

public class Circle1 {
	int radius;
	String name;
	public Circle1() {	//원의 생성자
	}
	public double getArea() { 	//원 넓이 계산
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle1 pizza;
		pizza = new Circle1(); // 객체 생성
		pizza.radius = 10; // 반지름 10
		pizza.name = "자바피자"; // 피자의 이름
		double area = pizza.getArea(); // 피자의 면적
		System.out.println(pizza.name + "의 면적은 " + area);	// 출력
		
		Circle1 donut = new Circle1(); // Circle 객체 생성
		donut.radius = 2; // 반지름을 2
		donut.name = "자바도넛"; // 도넛의 이름
		area = donut.getArea(); // 도넛의 면적
		System.out.println(donut.name + "의 면적은 " + area);	// 출력

	}
}
