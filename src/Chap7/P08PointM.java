package Chap7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class P08PointM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> PM=new HashMap<String,Integer>();
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String ans=sc.nextLine();
			if(ans.equals("�׸�")) break;
			StringTokenizer t=new StringTokenizer(ans," ");
			//��ũ��������, �յ� ��������
			String name=t.nextToken().trim();
			int point=Integer.parseInt(t.nextToken().trim());
			if(PM.get(name)!=null) {
				int temp=PM.get(name);
				PM.put(name, temp+point);
			}
			else {
				PM.put(name,point);
			}
			Set<String> keys=PM.keySet();
			Iterator<String> it=keys.iterator();
			while(it.hasNext()) {
				String n=it.next();
				int p=PM.get(n);
				System.out.print("("+n+","+p+")");
			}
			System.out.println();
		}
	}		
}
