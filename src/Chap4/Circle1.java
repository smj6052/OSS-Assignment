package Chap4;

public class Circle1 {
	int radius;
	String name;
	public Circle1() {	//���� ������
	}
	public double getArea() { 	//�� ���� ���
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle1 pizza;
		pizza = new Circle1(); // ��ü ����
		pizza.radius = 10; // ������ 10
		pizza.name = "�ڹ�����"; // ������ �̸�
		double area = pizza.getArea(); // ������ ����
		System.out.println(pizza.name + "�� ������ " + area);	// ���
		
		Circle1 donut = new Circle1(); // Circle ��ü ����
		donut.radius = 2; // �������� 2
		donut.name = "�ڹٵ���"; // ������ �̸�
		area = donut.getArea(); // ������ ����
		System.out.println(donut.name + "�� ������ " + area);	// ���

	}
}
