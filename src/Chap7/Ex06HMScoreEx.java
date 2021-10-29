package Chap7;
import java.util.*;

public class Ex06HMScoreEx {

	public static void main(String[] args) {
		//������̸�+���� >> HashMap �÷��� ����
		HashMap<String,Integer>javaScore=new HashMap<String,Integer>();
		
		//���� ����
		javaScore.put("�輺��",97);
		javaScore.put("Ȳ����", 88);
		javaScore.put("�賲��", 98);
		javaScore.put("���繮", 70);
		javaScore.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ���� :"+javaScore.size());
		
		//��� ��� ���� ��� >> (key,value)
		//key ���ڿ��� ���� ���� Set �÷��� ����
		Set<String> Keys=javaScore.keySet();
		
		//key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		Iterator<String>it=Keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			int score=javaScore.get(name);
			System.out.println(name+" : "+score);
		}
	}

}
