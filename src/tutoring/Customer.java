
package tutoring;

public class Customer {
	public static int Check(int money, int price) {
		if(money>=price)
			return money-price;
		else
			return -1;
	}
	public static void main(String[] args) {
		int money=0;
		int price=5500;
		int c=Check(money, price);
		
		if (c==-1) {
			System.out.println("���� ����, ������ ��ȯ");
		}
		else {
			System.out.println(c+"���� �����ʽÿ�");
		}
		
		
	}
}