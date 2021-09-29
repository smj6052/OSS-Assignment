package Chap4;
import java.util.Scanner;

class Dictionary {
	   private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	   private static String[] eng = {"love", "baby", "money", "future","hope"};
	   public static String kor2Eng(String word) { /*�˻� �ڵ� �ۼ�*/ 
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
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String ans=sc.next();
			if(ans.equals("�׸�")) {
				break;
			}
			String eng=Dictionary.kor2Eng(ans);
			if(eng.equals("--")) {
				System.out.println(ans+"�� ���� ������ �����ϴ�.");
			}
			else {
				System.out.println(ans+"�� "+eng);
			}
		}
		sc.close();
	}
}


