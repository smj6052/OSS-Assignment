package Chap2;

/*
* �ҽ� ���� : Hello.java
*/

//Ŭ����
public class Hello{
	//�޼ҵ�
	public static int sum(int n, int m) {
		return n+m;
	}
	
	//main() �޼ҵ忡�� ���� ����
	public static void main(String[] args) {
		int i=20;
		int s=0;
		char a;
		
		s=sum(i,10); 	//sum() �޼ҵ� ȣ��
		a='?';
		System.out.println(a);	//char�� ? ȭ�� ���
		System.out.println("Hello");	//Hello ȭ�� ���
		System.out.println(s);	//int�� s ȭ�� ���
		
	}
	
}
