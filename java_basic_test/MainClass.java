package java_basic_test;

public class MainClass {
	public static void main(String[] args) {
		Student student1 = new Student("������",10);
		student1.getinfo();
		
		student1.setScore(40);//50�̻� ������ġ�� �ɷ��ִµ� 40�̸� ������ �ȵ�.
		student1.getinfo();
	}
}
