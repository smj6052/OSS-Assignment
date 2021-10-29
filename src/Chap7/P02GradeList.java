package Chap7;
import java.util.*;

public class P02GradeList {
	static void printAvg(ArrayList<String> l) {
		double sum=0;
		ArrayList<String> ��=new ArrayList<>();
		for(int i=0;i<l.size();i++) {
			if(l.get(i).equals("A")) sum+=4.0;
			else if(l.get(i).equals("B")) sum+=3.0;
			else if(l.get(i).equals("C")) sum+=2.0;
			else if(l.get(i).equals("D")) sum+=1.0;
			else if(l.get(i).equals("F")) sum+=0.0;
		}
		System.out.println(sum/l.size());
	}

	public static void main(String[] args) {
		ArrayList<String> grade=new ArrayList<>();	//grade list ����
		//�Է¹ޱ�
		Scanner sc=new Scanner(System.in);
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");
		for(int i=0;i<6;i++) {
			String ans=sc.next();
			grade.add(ans);
		}
		printAvg(grade);
		sc.close();
	}
}
