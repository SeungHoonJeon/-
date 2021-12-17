package java_basic_test;

public class SecondChildClass extends ParentClass {
	public SecondChildClass() {
		System.out.println("SecondChildClass constructor");
	}
	
	@Override
	public void makeJJajang() {
		System.out.println("--SecondChildClass more makeJJajang()--");
	}
}
