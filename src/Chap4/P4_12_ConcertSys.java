package Chap4;
import java.util.Scanner;
/* 
 * # �¼��� S,A,B / ���� 10��
 * # menu : ����, ��ȸ, ���, ������
 */
class Seat{
	public String seats[];
	public void Seat() {
		seats=new String[10];
		for(int i=0;i<seats.length;i++) {
			seats[i]="---";
		}
	}
	public void show() { // �¼� ���� ���
		for(int i=0; i<seats.length; i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println();
	}
	public void set(String name,int num) {
		if(num>10) {
			System.out.println("10 ������ ���� �Է��ϼ���.");
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
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int g=sc.nextInt();
		System.out.print(Grade[g-1]+">>");
		row[g-1].show();
		
		System.out.print("�̸�>>");
		String name=sc.next();
		System.out.print("��ȣ>>");
		int num=sc.nextInt();
		row[g-1].set(name, num);
	}
	public void check() {
		for(int i=0;i<3;i++) {
			System.out.print(Grade[i]+">>");
			row[i].show();
		}
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	public void cancel() {
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int g=sc.nextInt();
		System.out.print(Grade[g-1]+">>");
		row[g-1].show();
		System.out.print("�̸�>>");
		String name=sc.next();
		if(row[g-1].set(name)) {
			System.out.println("<<<��Ҹ� �Ϸ��Ͽ����ϴ�>>>");
		}
		else {
			System.out.println("<<<�������� �ʴ� �̸��Դϴ�>>>");
		}
	}
}
	
public class P4_12_ConcertSys {

	public static void main(String[] args) {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		BSystem sys=new BSystem();
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >>");
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
				return;		//����
			}
		}
		
	}
}


