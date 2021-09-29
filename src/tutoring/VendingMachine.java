
package tutoring;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		int money;
		
		try (Scanner in = new Scanner(System.in)) {
			money=in.nextInt();
			System.out.print(money+"원을 받았습니다.");
			}
		}

}