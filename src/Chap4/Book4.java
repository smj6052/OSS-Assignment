package Chap4;

public class Book4 {
	String title;
	String author;
	
	public Book4(String t) { // ������
		title = t; author = "���ڹ̻�";
		}
		public Book4(String t, String a) { // ������
		title = t; author = a;
		}
		public static void main(String [] args) {
		Book4 littlePrince = new Book4("�����", "�������丮");
		Book4 loveStory = new Book4("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		}
	}