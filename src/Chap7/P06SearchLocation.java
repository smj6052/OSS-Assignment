package Chap7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location{
	private String city;
	private int lat,lon;
	
	public Location(String city, int lat, int lon) {
		this.city=city;
		this.lat=lat;
		this.lon=lon;
	}
	public void show() {
		System.out.println(city+"\t"+lat+"\t"+lon);
	}
}
public class P06SearchLocation {

	public static void main(String[] args) {
		HashMap<String,Location> cName=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("도시,경도위도를 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String text=sc.nextLine();
			StringTokenizer t=new StringTokenizer(text,",");
			String city=t.nextToken().trim();
			int lat=Integer.parseInt(t.nextToken().trim());
			int lon=Integer.parseInt(t.nextToken().trim());
			cName.put(city, new Location(city,lat,lon));
		}
		//keys 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> Keys=cName.keySet();
		//key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String>it=Keys.iterator();
		System.out.println("--------------------------------");
		while(it.hasNext()) {
			String c=it.next();
			Location l=cName.get(c);
			l.show();
		}
		System.out.println("----------------------------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String cAns = sc.next();
			if(cAns.equals("그만"))	break;
			Location s=cName.get(cAns);
			if(s==null) 	System.out.println(cAns+"는 없습니다.");
			else	cName.get(cAns).show();
		}
		sc.close();
	}

}
