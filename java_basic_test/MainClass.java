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
		
		
		System.out.println("서식문자테스트");
		//System.out.println("서식문자테스트  %d", a); // 이렇게 서식문자 쓰면 안됨. //error 
		System.out.printf("서식문자테스트 %d \n", a);
		System.out.printf("서식문자테스트 %o \n", a);
		System.out.printf("서식문자테스트 %x \n", a);
		
		/* error => 서식문자 형에 맞게끔 써야함.
		System.out.printf("서식문자테스트 %s \n", a);
		System.out.printf("서식문자테스트 %f \n", a);
		*/
		
		System.out.println("----------------------------");
		System.out.printf("서식문자테스트 %d \n", a);
		System.out.printf("서식문자테스트 %f \n", b);
		System.out.printf("서식문자테스트 %f \n", c);
		System.out.printf("서식문자테스트 %c \n", d);
		System.out.printf("서식문자테스트 %s \n", s);
		
		
		System.out.println("----------------------------");
		System.out.printf("서식문자테스트 %5d \n", a);
		System.out.printf("서식문자테스트 %.0f \n", b);
		System.out.printf("서식문자테스트 %.1f \n", c);
		System.out.printf("서식문자테스트 %c \n", d);
		System.out.printf("서식문자테스트 %s \n", s);
		
	}
}
