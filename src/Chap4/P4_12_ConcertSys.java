package Chap4;
import java.util.Scanner;
/* 
 * # 좌석은 S,A,B / 각각 10개
 * # menu : 예약, 조회, 취소, 끝내기
 */
class Seat{
	public String seats[];
	public void Seat() {
		seats=new String[10];
		for(int i=0;i<seats.length;i++) {
			seats[i]="---";
		}
	}
	public void show() { // 좌석 상태 출력
		for(int i=0; i<seats.length; i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println();
	}
	public void set(String name,int num) {
		if(num>10) {
			System.out.println("10 이하의 수를 입력하세요.");
		}
		else {
			seats[num-1]=name;
		}
		return;
	}
	public boolean set(String name) {
		for(int i=0;i<seats.length;i++) {
			if(seats[i].equals(name)) {
				seats[i]="---";
				return true;
			}
		}
		return false;
		
	}
	
}

class BSystem {
	Scanner sc;
	Seat row[];
	String Grade[]= {"S","A","B"};
	BSystem(){
		sc=new Scanner(System.in);
		row=new Seat[3];
		for(int i=0;i<3;i++) {
			row[i]=new Seat();
		}
	}
	public void tBook() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int g=sc.nextInt();
		System.out.print(Grade[g-1]+">>");
		row[g-1].show();
		
		System.out.print("이름>>");
		String name=sc.next();
		System.out.print("번호>>");
		int num=sc.nextInt();
		row[g-1].set(name, num);
	}
	public void check() {
		for(int i=0;i<3;i++) {
			System.out.print(Grade[i]+">>");
			row[i].show();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	public void cancel() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int g=sc.nextInt();
		System.out.print(Grade[g-1]+">>");
		row[g-1].show();
		System.out.print("이름>>");
		String name=sc.next();
		if(row[g-1].set(name)) {
			System.out.println("<<<취소를 완료하였습니다>>>");
		}
		else {
			System.out.println("<<<존재하지 않는 이름입니다>>>");
		}
	}
}
	
public class P4_12_ConcertSys {

	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		BSystem sys=new BSystem();
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			Scanner sc=new Scanner(System.in);
			int ans=sc.nextInt();
			switch(ans){
			case 1:
				sys.tBook();
				
			case 2:
				sys.check();
			case 3:
				sys.cancel();
			case 4:
				sc.close();
				return;		//종료
			}
		}
		
	}
}


