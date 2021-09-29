package Chap4;
class Rectangle{
	//int Ÿ���� �ʵ�
	int x; int y;
	int width; int height;
	
	Rectangle(int x,int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	public int square() {
		return width*height;
	}
	
	//��ǥ�� ���̸� ȭ�鿡 ���
	public void show() {
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	
	//�Ű������� ���� r�� �簢�� �ȿ� ������ true return (��ġ�� �ȵ�)
	boolean contains (Rectangle r) {
		if(x<r.x&&y<r.y) {
			if((x+width)>(r.x+r.width)&&(y+height)>(r.y+r.height))
				return true;
		}
		return false;
	}
}
public class P4_4 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(2,2,8,7);
		Rectangle s=new Rectangle(5,5,6,6);
		Rectangle t=new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		if(t.contains(r))System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s))System.out.println("t�� s�� �����մϴ�.");

	}

}
