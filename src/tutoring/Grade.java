/* sum을 static 메소드로 만들기*/
package tutoring;

import java.util.Scanner;



public class Grade {
	
	
	private int math; 
	private int science; 
	private int english;
	
	public Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}
	 
	public static int sum(int x,int y, int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math=scanner.nextInt();
		int science=scanner.nextInt();
		int english=scanner.nextInt();
		//Grade me=new Grade(math,science,english);
		System.out.println("sum은 "+Grade.sum(math,science,english));
		
		scanner.close();

	}

}
