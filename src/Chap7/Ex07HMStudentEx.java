package Chap7;
import java.util.*;
//학생 표현
class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id=id;
		this.tel=tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}
public class Ex07HMStudentEx {

	public static void main(String[] args) {
		// 학생 이름 + Student 객체 >> HashMap 컬렉션 생성
		HashMap<String, Student> map=new HashMap<>();
		
		//학생 3명 저장
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-3333"));
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name=sc.nextLine(); 		//사용자 입력
			if(name.equals("exit"))	break;		//종료
			Student stu=map.get(name);		//이름에 해당하는 Student 검색
			if(stu==null)	System.out.println(name+"은 없는 사람입니다.");
			else System.out.println("id:" + stu.getId() + ", 전화:" + stu.getTel());
		}
		sc.close();
	}
}
