package Chap4;
import java.util.Scanner;
class Grade{
	private int math;
	private int science;
	private int english;
	Grade(int math, int science, int english){
		this.math=math;
		this.english=english;
		this.science=science;
	}
	public int average() {
		return(math+science+english)/3;
	}
}

public class P4_2 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math=scanner.nextInt();
		int science=scanner.nextInt();
		int english=scanner.nextInt();
		Grade me=new Grade(math,science,english);
		System.out.println("����� "+me.average());
		
		scanner.close();
	}
}
