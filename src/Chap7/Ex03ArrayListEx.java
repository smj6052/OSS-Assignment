package Chap7;
import java.util.*;
public class Ex03ArrayListEx {

	public static void main(String[] args) {
		// ���ڿ��� �����ϴ� ArrayList  ����
		ArrayList<String> a=new ArrayList<>();
		
		//Ű���� �Է� 4�� �޾� ArrayList�� ����
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("�̸��� �Է��ϼ���>>");
			String s=sc.next();	//Ű���� �Է�
			a.add(s);	//ArrayList ����
		}
		
		//ArrayList ��� �̸� ���
		for(int i=0;i<a.size();i++) {	//a�� ũ�⸸ŭ �ݺ�
			String name=a.get(i);
			System.out.print("name"+" ");
		}
		int longestIndex=0;
		for(int i=1;i<a.size();i++) {
			if(a.get(longestIndex).length()<a.get(i).length())
				longestIndex=i;
		}
		System.out.print("\n���� �� �̸��� : "+a.get(longestIndex));
		sc.close();
	}	
}
