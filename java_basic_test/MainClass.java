package java_basic_test;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Good");
		System.out.printf("Good");
		System.out.printf("Good");
		
		System.out.println("good\tgood\tgood");
		System.out.println("goo    d\ngood");
		System.out.println("seunghoon : \"good\"");
		System.out.println("seunghoon : \'good\'");
		System.out.println("seunghoon : \\good\\");
		
		System.out.println("----------------------------");
		int a = 10;
		float b = 5.2f;
		double c = 1.128547d;
		char d = 'a';
		String s = "hello";
		
		
		System.out.println("���Ĺ����׽�Ʈ");
		//System.out.println("���Ĺ����׽�Ʈ  %d", a); // �̷��� ���Ĺ��� ���� �ȵ�. //error 
		System.out.printf("���Ĺ����׽�Ʈ %d \n", a);
		System.out.printf("���Ĺ����׽�Ʈ %o \n", a);
		System.out.printf("���Ĺ����׽�Ʈ %x \n", a);
		
		/* error => ���Ĺ��� ���� �°Բ� �����.
		System.out.printf("���Ĺ����׽�Ʈ %s \n", a);
		System.out.printf("���Ĺ����׽�Ʈ %f \n", a);
		*/
		
		System.out.println("----------------------------");
		System.out.printf("���Ĺ����׽�Ʈ %d \n", a);
		System.out.printf("���Ĺ����׽�Ʈ %f \n", b);
		System.out.printf("���Ĺ����׽�Ʈ %f \n", c);
		System.out.printf("���Ĺ����׽�Ʈ %c \n", d);
		System.out.printf("���Ĺ����׽�Ʈ %s \n", s);
		
		
		System.out.println("----------------------------");
		System.out.printf("���Ĺ����׽�Ʈ %5d \n", a);
		System.out.printf("���Ĺ����׽�Ʈ %.0f \n", b);
		System.out.printf("���Ĺ����׽�Ʈ %.1f \n", c);
		System.out.printf("���Ĺ����׽�Ʈ %c \n", d);
		System.out.printf("���Ĺ����׽�Ʈ %s \n", s);
		
	}
}
