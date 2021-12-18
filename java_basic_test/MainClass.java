package java_basic_test;


public class MainClass {
	public static void main(String[] args) {
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> {
			System.out.println(s1+" "+s2+" "+s3+" ");
		};
		li1.method("Hello", "java", "World");
		
		
		//�Ű������� 1���̰ų� Ÿ���� ���� �� Ÿ���� ������ �� �ִ�. 
		LambdaInterface2 li2 = (s1) -> {System.out.println(s1);};
		li2.method("hello");
		
		//�Ű������� �ϳ� �� �� () �����ϰ� ���๮�� �ϳ��̸� {} ������ �� �ִ�. 
		LambdaInterface2 li4 = s1 -> System.out.println(s1);
		li4.method("hello");
		
		//�Ű������� ���� ���� () �� �ۼ��ϰ� ���๮�� �ϳ��̸� {} �����ص� �ȴ�.
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
