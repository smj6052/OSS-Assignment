package Chap6;
//StringTokenizer class method È°¿ë
import java.util.StringTokenizer;

public class Ex6_9StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
