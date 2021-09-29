package Chap4;
import java.util.Scanner;

class Phone{
	private String name, tel;	//필드
	public Phone(String name,String tel){		//생성자
		this.name=name;
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}
public class P4_8_PhoneBook {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("인원수>>");
		int num=sc.nextInt();	//인원수
		
		/*이름 전화번호 저장*/
		Phone p[]=new Phone[num];//num개의 phone 배열 생성 
		for(int i=0;i<num;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name=sc.next();
			String tel=sc.next();
			p[i]=new Phone(name,tel);
		}
		System.out.println("저장되었습니다...");
		
		/*검색*/
		while(true) {	
			System.out.print("검색할 이름>>");
			String name=sc.next();
			if(name.equals("그만"))		//==는 주소값을 비교하므로 대상의 내용을 비교하는 equals 사용!
				break;
			else {
				int empty=0;
				for(int i=0;i<p.length;i++) {
					if(name.equals(p[i].getName())) {
						System.out.println(name+"의 번호는 "+p[i].getTel()+" 입니다.");
					}
					else empty++;
				}
				if(empty==p.length)
					System.out.println(name+" 이 없습니다.");
			}	
		}
		sc.close();
	}
}
