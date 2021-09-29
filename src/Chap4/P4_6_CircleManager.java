package Chap4;
import java.util.Scanner;

class Circle {
   private double x, y;
   private int radius;
   public Circle(double x, double y, int radius) {		//������ �޼ҵ�
     //x, y, radius �ʱ�ȭ
	   this.x=x;
	   this.y=y;
	   this.radius=radius;
   }
   public void show() {
      System.out.println("("+x+","+y+")"+radius);
   }
   public int getRadius() {		//�ܺ� Ŭ������ �ش� ������ ��G�ϱ� ���� get �޼ҵ�
	   return radius;
   }
}

public class P4_6_CircleManager {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Circle c[] = new Circle[3]; // 3���� Circle �迭 ����
	      for(int i=0; i < c.length; i ++) {
	         System.out.print("x, y, radius >>");
	         //�� ���� �о���� circle ��ü ����**
	         double x=sc.nextDouble(); // x�� �б�.
	         double y=sc.nextDouble(); // y�� �б�.
	         int radius=sc.nextInt(); // radius�� �б�.
	         c[i] = new Circle(x,y,radius); // Circle ��ü ����
	      }
	      int max=0;
	      for(int i=1; i<c.length; i++) {
	    	  if(c[max].getRadius()<c[i].getRadius()) {
	    		  max=i;
	    	  }
	      }
	      //���� ����
    	  System.out.print("���� ������ ū ���� ");
    	  c[max].show();
	      sc.close();
	   }
}
