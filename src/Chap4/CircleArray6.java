package Chap4;

class Circle6 {
	int radius;
	
	public Circle6(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}
public class CircleArray6 {
	public static void main(String[] args) {
	Circle6 [] c;
	c = new Circle6[5];
	
	for(int i=0; i<c.length; i++)
	c[i] = new Circle6(i);
	
	for(int i=0; i<c.length; i++)
	System.out.print((int)(c[i].getArea()) + " ");
	}
}
