package Chap4;

public class GarbageEx9 {

	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null;
		d = c;
		c = null;
	}
}

/* 가비지의 발생
 *  a->"Good" >> "Good" 가비지 발생
 * */
 