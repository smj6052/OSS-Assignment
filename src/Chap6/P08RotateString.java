package Chap6;
import java.util.Scanner;

public class P08RotateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String str = sc.nextLine();
		for(int i = 1; i <= str.length() ;i++) {
			System.out.print(str.substring(i));		//
			System.out.println(str.substring(0, i));
		}
		sc.close();
	}
}
