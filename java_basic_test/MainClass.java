package java_basic_test;

public class MainClass {
	public static void main(String[] args) {
		byte a = 10;
		int b = 10;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 100; //0110 0100
		byte c_1 = (byte)c;
		System.out.println(c_1);
		
		int d = 1000000; // 1111 0100 0010 0100 0000
		byte d_1 = (byte)d;
		System.out.println(d_1); //1111 0100 0010 0100 0000 중에서 0100 0000만 처리함.  
		
		int f = 1000001; // 1111 0100 0010 0100 0001
		byte f_1 = (byte)f;
		System.out.println(f_1);  // 1111 0100 0010 0100 0001 중에서 0100 0001만 처리함.
	}
}
