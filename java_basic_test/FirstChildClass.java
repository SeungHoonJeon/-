package java_basic_test;

public class FirstChildClass extends ParentClass {
	public FirstChildClass() {
		System.out.println("FirstChildClass constructor");
	}
	
	@Override
	public void makeJJajang() {
		System.out.println("--FirstChildClass more makeJJajang()--");
	}
}
