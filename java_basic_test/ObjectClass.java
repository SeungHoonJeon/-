package java_basic_test;

public class ObjectClass {
	public int x;
	public int y;
	
	public ObjectClass(String s, int[] arr){
		System.out.println("--ObjectClass()--");
		System.out.println("s ------> "+s);
		System.out.println("arr -------> " +arr);
	}
	public ObjectClass(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x-->"+x);
		System.out.println("x-->"+y);
	}
	
	public void getInfo() {
		System.out.println("x-->"+x);
		System.out.println("x-->"+y);
	}
}
