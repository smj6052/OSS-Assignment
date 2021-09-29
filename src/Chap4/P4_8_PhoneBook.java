package Chap4;
import java.util.Scanner;

class Phone{
	private String name, tel;	//�ʵ�
	public Phone(String name,String tel){		//������
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
		System.out.print("�ο���>>");
		int num=sc.nextInt();	//�ο���
		
		/*�̸� ��ȭ��ȣ ����*/
		Phone p[]=new Phone[num];//num���� phone �迭 ���� 
		for(int i=0;i<num;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name=sc.next();
			String tel=sc.next();
			p[i]=new Phone(name,tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		/*�˻�*/
		while(true) {	
			System.out.print("�˻��� �̸�>>");
			String name=sc.next();
			if(name.equals("�׸�"))		//==�� �ּҰ��� ���ϹǷ� ����� ������ ���ϴ� equals ���!
				break;
			else {
				int empty=0;
				for(int i=0;i<p.length;i++) {
					if(name.equals(p[i].getName())) {
						System.out.println(name+"�� ��ȣ�� "+p[i].getTel()+" �Դϴ�.");
					}
					else empty++;
				}
				if(empty==p.length)
					System.out.println(name+" �� �����ϴ�.");
			}	
		}
		sc.close();
	}
}
