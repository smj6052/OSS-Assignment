package Chap2;

public class TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i);	
		System.out.println(10/4);	//int >>2
		System.out.println(10.0/4);		//실수형 >> 2.5
		System.out.println((char)0x12340041);	//강제 타입 변환 >> 문자 A
		System.out.println((byte)(b+i));	// 1byte=-128~127
		System.out.println((int)2.9 + 1.8);		//2+1.8 >> 3.8
		System.out.println((int)(2.9 + 1.8));	//(int)(4.7) >> 4	
		System.out.println((int)2.9 + (int)1.8);	//2+1 >> 3
	}
}
