package Chap5;

class Person2 {
	private int weight;
	int age;
	protected int height;
	public String name;
	public void setWeight(int weight) {
	this.weight = weight;
	}
	public int getWeight() {
	return weight;
	}
}
class Student2 extends Person2 {
	public void set() {
		age = 30; // ���� Ŭ������ ����Ʈ ��� ���� ����
		name = "ȫ�浿"; // ���� Ŭ������ public ��� ���� ����
		height = 175; // ���� Ŭ������ protected ��� ���� ����
		// weight = 99; // ����. ���� Ŭ������ private ���� �Ұ�
		setWeight(99); // private ��� weight�� setWeight()���� ���� ����
	}
}
public class Ex5_2InheritanceEx {

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.set();
	}

}
