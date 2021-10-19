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
	public void Set() {		//game player 설정
		player = new Player[2];
		player[0] = new Player("황기태");
		player[1] = new Player("이재문");
		
	}
	public void Run() {		//game  실행
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		for(int i=0; i<player.length; i++) {	//player 수 만큼 반복
			System.out.print(player[i].getName() + "시작 <Enter>키 >>");
			String ent = sc.nextLine();
			int startSec = Calendar.getInstance().get(Calendar.SECOND);
			System.out.println("현재 초 시간 = " + startSec);
			
			System.out.print("10초 예상 후 <Enter>키 >>");
			ent = sc.nextLine();
			int endSec = Calendar.getInstance().get(Calendar.SECOND);
			System.out.println("현재 초 시간 = " + endSec);
			
			if(endSec < startSec)	//endSec가 60초 지나면
				player[i].setSec(endSec-startSec+60);
			else
				player[i].setSec(endSec-startSec);
		}
	}
	public void Result() {
		for(int i=0; i<player.length; i++) {
			System.out.print(player[i].getName() + "의 결과 " + player[i].getSec() + ", ");
		}
		
		if(Math.abs(player[0].getSec()-10) < Math.abs(player[1].getSec()-10))
			System.out.println("승자는 " + player[0].getName());
		else if(Math.abs(player[0].getSec()-10) > Math.abs(player[1].getSec()-10))
			System.out.println("승자는 " + player[1].getName());
		else
			System.out.println("무승부입니다.");
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
