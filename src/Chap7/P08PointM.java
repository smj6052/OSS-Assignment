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
		System.out.println("** 포인트 관리 프로그램입니다 **");
		
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String ans=sc.nextLine();
			if(ans.equals("그만")) break;
			StringTokenizer t=new StringTokenizer(ans," ");
			//토크나이저후, 앞뒤 공백제거
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
