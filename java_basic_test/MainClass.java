package java_basic_test;

public class MainClass {
	public static void main(String[] args) {
		int num = 100; // 4byte
		char c = 'a'; //2byte? -> c¶û Á» ´Ù¸§.
		double d = 10.258; //8byte
		boolean b = false; //1byte
		
		String s = "Hello World!!!!";
		
		System.out.println("num="+100);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("b="+b);
		System.out.println("s="+s);
		
		System.out.println("--------------------------------");
		System.out.println("byte: " + Byte.BYTES);
		System.out.println("char: " + Character.BYTES);
		System.out.println("int: " + Integer.BYTES);
		System.out.println("long: " + Long.BYTES);
		System.out.println("short: " + Short.BYTES);
		System.out.println("double: " + Double.BYTES);
		System.out.println("float: " + Float.BYTES);
	}
}
