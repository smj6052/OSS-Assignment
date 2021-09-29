package Chap4;

public class Book4 {
	String title;
	String author;
	
	public Book4(String t) { // 생성자
		title = t; author = "작자미상";
		}
		public Book4(String t, String a) { // 생성자
		title = t; author = a;
		}
		public static void main(String [] args) {
		Book4 littlePrince = new Book4("어린왕자", "생텍쥐페리");
		Book4 loveStory = new Book4("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		}
	}