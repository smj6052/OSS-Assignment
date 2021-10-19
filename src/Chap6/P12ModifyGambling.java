package Chap6;
import java.util.Scanner;

class NGamester {
	private int num1, num2, num3;
	public String name;
	public NGamester(String name) {
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
public class P12ModifyGambling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		int num = sc.nextInt();
		NGamester[] NGamester = new NGamester[num];
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			String name = sc.next();
			NGamester[i] = new NGamester(name);
		}
		String buffer = sc.nextLine();
		while(true) {
			for(int i=0; i<num; i++) {
				System.out.print("["+NGamester[i].name+"]:<Enter>");
				buffer = sc.nextLine();
				if(NGamester[i].game()) {
					System.out.println(NGamester[i].name+"님이 이겼습니다!");
					sc.close();
					return;
				}
				System.out.println("아쉽군요!");
			}
		}
	}
}
