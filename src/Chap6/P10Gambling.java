package Chap6;
import java.util.Scanner;

class Gamester {
	private int num1, num2, num3;
	public String name;
	public Gamester(String name) {
		this.name = name;
	}
	public boolean game() {
		num1 = (int) ((Math.random()*3)+1);
		num2 = (int) ((Math.random()*3)+1);
		num3 = (int) ((Math.random()*3)+1);
		System.out.print("\t"+num1+"  "+num2+"  "+num3+"  ");
		if(num1 == num2 && num2 == num3)
			return true;
		else 
			return false;
	}
}

public class P10Gambling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String name = sc.next();
		Gamester Gamester1 = new Gamester(name);
		System.out.print("2번째 선수 이름>>");
		name =sc.next();
		Gamester Gamester2 = new Gamester(name);
		String ent = sc.nextLine();
		while(true) {
			System.out.print("["+Gamester1.name+"]:<Enter>");
			ent = sc.nextLine();
			if(Gamester1.game()) {
				System.out.println(Gamester1.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			System.out.print("["+Gamester2.name+"]:<Enter>");
			ent = sc.nextLine();
			if(Gamester2.game()) {
				System.out.println(Gamester2.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		sc.close();
	}
}
