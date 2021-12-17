package java_basic_test;

public class MainClass {
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.childFun();
		childClass.parentFun();
		
		childClass.privateFun(); //childClass can't access this
	}
}
