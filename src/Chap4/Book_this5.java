package Chap4;

public class Book_this5 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	
	public Book_this5() { // ������
		this("","");
		System.out.println("������ ȣ���");
		}
	public Book_this5(String title) { // ������
		this(title,"���ڹ̻�");
		}
	public Book_this5(String title,String author) { // ������
		this.title=title;
		this.title=author;
		}
	public static void main(String [] args) {
		Book_this5 littlePrince = new Book_this5("�����", "�������丮");
		Book_this5 loveStory = new Book_this5("������");
		Book_this5 emptyBook = new Book_this5();
		Book_this5 bible=new Book_this5("Bible");
		loveStory.show();
		
		bible.show();
	}
}
