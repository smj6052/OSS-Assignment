package Chap4;

public class Circle3 {
	int radius;
	String name;
	
	//�������̸� == Ŭ���� �̸�
	public Circle3() {	// ���� �Ű� ���� ���� ������
		radius=1;
		name="";		// ���� Ÿ�� ����
	}
	public Circle3(int r, String n) {	// ���� �Ű� ���� �ִ� ������
		radius=r;
		name=n;		// ������ ���� Ÿ�� ����
	}
	public double getArea() { 	//�� ���� ���
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle3 pizza;
		pizza = new Circle3(); // ��ü ����
		pizza.radius = 10; // ������ 10
		pizza.name = "�ڹ�����"; // ������ �̸�
		double area = pizza.getArea(); // ������ ����
		System.out.println(pizza.name + "�� ������ " + area);	// ���
		
		Circle3 donut = new Circle3(); // Circle ��ü ����
		donut.name = "��������"; // ������ �̸�
		area = donut.getArea(); // ������ ����
		System.out.println(donut.name + "�� ������ " + area);	// ���

	}
}
