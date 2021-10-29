package Chap7;
import java.util.*;
import java.util.Scanner;

abstract class Shape{
	public abstract void draw();
}
class Line extends Shape {
	String name ="line";
	public void draw() {
	System.out.println("Line");
	}
}
class Rect extends Shape {
	String name ="Rect";
	public void draw() {
	System.out.println("Rect");
	}
}
class Circle extends Shape {
	String name ="circle";
	public void draw() {
	System.out.println("Circle");
	}
}


public class P10ShapeV {
	static Scanner sc = new Scanner(System.in);
	static Vector<Shape> v = new Vector<Shape>();
	public static void insert(int shape) {
		Shape s;
		switch(shape) {
		case 1:
			s = new Line(); 
			v.add(s); 
			break;
		case 2:
			s = new Rect(); 
			v.add(s); 
			break;
		case 3:
			s = new Circle(); 
			v.add(s); 
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�."); return;
		}
	}
	public static void delete(int pos) {
		if(v.size()==0||v.size()<=pos)	System.out.println("������ �� �����ϴ�.");
		else	v.remove(pos - 1);
	}
	public static void print() {
		for(int i = 0; i < v.size(); i++) {
		Shape s = v.get(i);
		s.draw();
		}
	}

	public static void main(String[] args) {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.print("Line(1), Rect(2), circle(3)>>");
				int shape = sc.nextInt();
				insert(shape); 
				break;
			case 2:
				System.out.print("������ ������ ��ġ>>");
				int target = sc.nextInt();
				delete(target); 
				break;
			case 3:
				print(); 
				break;
			case 4:
				System.out.println("beauty�� �����մϴ�.");
				sc.close();
				return;
			}
		}

	}

}
