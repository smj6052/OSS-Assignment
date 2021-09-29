package Chap4;
import java.util.Scanner;

class Dictionary {
	   private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	   private static String[] eng = {"love", "baby", "money", "future","hope"};
	   public static String kor2Eng(String word) { /*검색 코드 작성*/ 
		   for(int i=0; i<kor.length;i++)  {
			   if(word.equals(kor[i])) {
				   return eng[i];
			   }
		   }
		   return "--";
	   }
}
public class p4_10_DicApp {

	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("한글 단어?");
			String ans=sc.next();
			if(ans.equals("그만")) {
				break;
			}
			String eng=Dictionary.kor2Eng(ans);
			if(eng.equals("--")) {
				System.out.println(ans+"는 저의 사전에 없습니다.");
			}
			else {
				System.out.println(ans+"은 "+eng);
			}
		}
		sc.close();
	}
}


