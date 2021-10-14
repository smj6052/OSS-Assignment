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

/* 오류 발생 원인 
 *  b는 private으로 선언이 되어서 AccessEx10 클래스에서 접근이 불가능
*/
