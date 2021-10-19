package Chap6;

import java.util.Calendar;
import java.util.Scanner;

class Player {
	private String name;
	private int sec;
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getSec() {
		return sec;
	}
}

class Game {
	Scanner sc = new Scanner(System.in);
	private Player[] player;
	public void Set() {		//game player ����
		player = new Player[2];
		player[0] = new Player("Ȳ����");
		player[1] = new Player("���繮");
		
	}
	public void Run() {		//game  ����
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		for(int i=0; i<player.length; i++) {	//player �� ��ŭ �ݺ�
			System.out.print(player[i].getName() + "���� <Enter>Ű >>");
			String ent = sc.nextLine();
			int startSec = Calendar.getInstance().get(Calendar.SECOND);
			System.out.println("���� �� �ð� = " + startSec);
			
			System.out.print("10�� ���� �� <Enter>Ű >>");
			ent = sc.nextLine();
			int endSec = Calendar.getInstance().get(Calendar.SECOND);
			System.out.println("���� �� �ð� = " + endSec);
			
			if(endSec < startSec)	//endSec�� 60�� ������
				player[i].setSec(endSec-startSec+60);
			else
				player[i].setSec(endSec-startSec);
		}
	}
	public void Result() {
		for(int i=0; i<player.length; i++) {
			System.out.print(player[i].getName() + "�� ��� " + player[i].getSec() + ", ");
		}
		
		if(Math.abs(player[0].getSec()-10) < Math.abs(player[1].getSec()-10))
			System.out.println("���ڴ� " + player[0].getName());
		else if(Math.abs(player[0].getSec()-10) > Math.abs(player[1].getSec()-10))
			System.out.println("���ڴ� " + player[1].getName());
		else
			System.out.println("���º��Դϴ�.");
	}
}
public class P06GamePlay {

	public static void main(String[] args) {
		Game game = new Game();
		game.Set();
		game.Run();
		game.Result();
		game.sc.close();
	}
}
