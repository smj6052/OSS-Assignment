package Chap7;
import java.util.*;

public class EX05HashMapDicEx {

	public static void main(String[] args) {
		//����+�ѱ� >> HashMap �÷��� ����
		HashMap<String,String>dic=new HashMap<String,String>();
		
		//(key,value) 3���� dic ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		//����ܾ� �Է� >>�ѱ۴ܾ� �˻�
		//exit ����
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��?");
			String eng=sc.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			String kor=dic.get(eng);
			if(kor==null) {
				System.out.println(eng+"�� ���� �ܾ� �Դϴ�.");
			}
			else {
				System.out.println(kor);
			}	
		}
		sc.close();
	}
}
