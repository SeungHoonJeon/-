package java_basic_test;


public class MainClass {
	public static void main(String[] args) {
		String str = "JAVA";
		//String str = new String("Java"); 이렇게도 써도 되지만 자주 쓰이는 클래스이기 떄문에 간단하게 쓸 수 있게 이렇게 만듬
		System.out.println("str: "+str);
		
		str = str + "_8";
		System.out.println("str"+ str);
		
		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println("sf : "+sf);
		sf.append("World");
		System.out.println("sf: " +sf);
		System.out.println("sf.length():"+sf.length());
		sf.insert(sf.length(), "~~~~"); //매개변수1 : 삽입할 위치, 매개변수2: 삽일 할 문자열
		System.out.println("sf: " +sf);
		
		sf.delete(4, 8);
		System.out.println("sf: " +sf);
		
		StringBuilder sb = new StringBuilder("JAVA World!!");
		System.out.println("sb: "+sb);
	}
}
