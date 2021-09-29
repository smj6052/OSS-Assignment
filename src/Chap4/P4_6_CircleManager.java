package Chap4;
import java.util.Scanner;

class Circle {
   private double x, y;
   private int radius;
   public Circle(double x, double y, int radius) {		//생성자 메소드
     //x, y, radius 초기화
	   this.x=x;
	   this.y=y;
	   this.radius=radius;
   }
   public void show() {
      System.out.println("("+x+","+y+")"+radius);
   }
   public int getRadius() {		//외부 클래스가 해당 변수를 사욯하기 위한 get 메소드
	   return radius;
   }
}

public class P4_6_CircleManager {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
	      for(int i=0; i < c.length; i ++) {
	         System.out.print("x, y, radius >>");
	         //값 먼저 읽어오고 circle 객체 생성**
	         double x=sc.nextDouble(); // x값 읽기.
	         double y=sc.nextDouble(); // y값 읽기.
	         int radius=sc.nextInt(); // radius값 읽기.
	         c[i] = new Circle(x,y,radius); // Circle 객체 생성
	      }
	      int max=0;
	      for(int i=1; i<c.length; i++) {
	    	  if(c[max].getRadius()<c[i].getRadius()) {
	    		  max=i;
	    	  }
	      }
	      //츨력 형식
    	  System.out.print("가장 면적이 큰 원은 ");
    	  c[max].show();
	      sc.close();
	   }
}
