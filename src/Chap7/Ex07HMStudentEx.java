package Chap7;
import java.util.*;
//�л� ǥ��
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
		// �л� �̸� + Student ��ü >> HashMap �÷��� ����
		HashMap<String, Student> map=new HashMap<>();
		
		//�л� 3�� ����
		map.put("Ȳ����", new Student(1, "010-111-1111"));
		map.put("���繮", new Student(2, "010-222-2222"));
		map.put("�賲��", new Student(3, "010-333-3333"));
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�?");
			String name=sc.nextLine(); 		//����� �Է�
			if(name.equals("exit"))	break;		//����
			Student stu=map.get(name);		//�̸��� �ش��ϴ� Student �˻�
			if(stu==null)	System.out.println(name+"�� ���� ����Դϴ�.");
			else System.out.println("id:" + stu.getId() + ", ��ȭ:" + stu.getTel());
		}
		sc.close();
	}
}
