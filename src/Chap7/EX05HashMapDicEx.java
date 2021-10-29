package Chap7;
import java.util.*;

public class EX05HashMapDicEx {

	public static void main(String[] args) {
		//영어+한글 >> HashMap 컬렉션 생성
		HashMap<String,String>dic=new HashMap<String,String>();
		
		//(key,value) 3개를 dic 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//영어단어 입력 >>한글단어 검색
		//exit 종료
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String eng=sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			String kor=dic.get(eng);
			if(kor==null) {
				System.out.println(eng+"는 없는 단어 입니다.");
			}
			else {
				System.out.println(kor);
			}	
		}
		sc.close();
	}
}
