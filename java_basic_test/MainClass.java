package java_basic_test;

public class MainClass {
	public static void main(String[] args) {
		new AnonymousClass(){
			public void method() {
				System.out.println("--AnonymousClass's Override method START");
			};
		}.method();
	}
}
