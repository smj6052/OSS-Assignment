package Chap6;
//StringTokenizer class method Ȱ��
import java.util.StringTokenizer;

public class Ex6_9StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
