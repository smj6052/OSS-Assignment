package Chap4;

class Sample {
	public int a;
	private int b;
	int c;
}
public class AccessEx10 {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.b = 10;
		aClass.c = 10;
		}
}

/* ���� �߻� ���� 
 *  b�� private���� ������ �Ǿ AccessEx10 Ŭ�������� ������ �Ұ���
*/
