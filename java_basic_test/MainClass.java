package java_basic_test;


public class MainClass {
	public static void main(String[] args) {
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> {
			System.out.println(s1+" "+s2+" "+s3+" ");
		};
		li1.method("Hello", "java", "World");
		
		
		//매개변수가 1개이거나 타입이 같을 때 타입을 생략할 수 있다. 
		LambdaInterface2 li2 = (s1) -> {System.out.println(s1);};
		li2.method("hello");
		
		//매개변수가 하나 일 때 () 생략하고 실행문도 하나이면 {} 생략할 수 있다. 
		LambdaInterface2 li4 = s1 -> System.out.println(s1);
		li4.method("hello");
		
		//매개변수가 없을 떄는 () 만 작성하고 실행문이 하나이면 {} 생략해도 된다.
		LambdaInterface3 li3 = () -> System.out.println("no parameter");
		
		LambdaInterface4 li5 = (x,y) -> {
			int result = x+y;
			return result;
		};
		System.out.printf("li6.method(10,20) : %d \n", li5.method(10,20));
		
		li5=(x,y)->{
			int result = x*y;
			return result;
		};
		System.out.printf("li6.method(10,20) : %d \n", li5.method(10,20));
	}
}
