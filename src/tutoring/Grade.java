/* sum�� static �޼ҵ�� �����*/
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

		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math=scanner.nextInt();
		int science=scanner.nextInt();
		int english=scanner.nextInt();
		//Grade me=new Grade(math,science,english);
		System.out.println("sum�� "+Grade.sum(math,science,english));
		
		scanner.close();

	}

}
