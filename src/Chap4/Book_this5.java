package Chap4;

public class Book_this5 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	
	public Book_this5() { // 생성자
		this("","");
		System.out.println("생성자 호출됨");
		}
	public Book_this5(String title) { // 생성자
		this(title,"작자미상");
		}
	public Book_this5(String title,String author) { // 생성자
		this.title=title;
		this.title=author;
		}
	public static void main(String [] args) {
		Book_this5 littlePrince = new Book_this5("어린왕자", "생텍쥐페리");
		Book_this5 loveStory = new Book_this5("춘향전");
		Book_this5 emptyBook = new Book_this5();
		Book_this5 bible=new Book_this5("Bible");
		loveStory.show();
		
		bible.show();
	}
}
