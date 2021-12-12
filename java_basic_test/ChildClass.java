package java_basic_test;

public class ChildClass {
	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("--ChildClass constructor--");
	}
	public void setInfo(String n, String g, int a) {
		System.out.println("--setInfo() START--");
		
		this.name = n;
		this.gender = g;
		this.age = a;
	}
	public void getInfo() {
		System.out.println("--getInfo() START--");
		
		System.out.println("name :"+name);
		System.out.println("gender :"+gender);
		System.out.println("age :"+age);
	}
	private void good() {
		System.out.println("---------");
	}
}
