package Chap2;

/*
* 소스 파일 : Hello.java
*/

//클래스
public class Hello{
	//메소드
	public static int sum(int n, int m) {
		return n+m;
	}
	
	//main() 메소드에서 실행 시작
	public static void main(String[] args) {
		int i=20;
		int s=0;
		char a;
		
		s=sum(i,10); 	//sum() 메소드 호출
		a='?';
		System.out.println(a);	//char형 ? 화면 출력
		System.out.println("Hello");	//Hello 화면 출력
		System.out.println(s);	//int형 s 화면 출력
		
	}
	
}
