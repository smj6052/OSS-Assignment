package Chap7;

import java.util.Scanner;
import java.util.Vector;

public class P04RainVector {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int ans=sc.nextInt();
			if(ans==0)	break;
			v.add(ans);
			int sum=0;
			for(int i=0;i<v.size();i++) {
				sum+=v.get(i);
				System.out.print(v.get(i)+" ");
			}
			System.out.println();
			System.out.println("���� ��� "+sum/v.size());
		}
		sc.close();
	}
}
