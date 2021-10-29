package Chap7;
import java.util.*;
public class Ex03ArrayListEx {

	public static void main(String[] args) {
		// 문자열만 삽입하는 ArrayList  생성
		ArrayList<String> a=new ArrayList<>();
		
		//키보드 입력 4개 받아 ArrayList에 삽입
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요>>");
			String s=sc.next();	//키보드 입력
			a.add(s);	//ArrayList 삽입
		}
		
		//ArrayList 모든 이름 출력
		for(int i=0;i<a.size();i++) {	//a의 크기만큼 반복
			String name=a.get(i);
			System.out.print("name"+" ");
		}
		int longestIndex=0;
		for(int i=1;i<a.size();i++) {
			if(a.get(longestIndex).length()<a.get(i).length())
				longestIndex=i;
		}
		System.out.print("\n가장 긴 이름은 : "+a.get(longestIndex));
		sc.close();
	}	
}
