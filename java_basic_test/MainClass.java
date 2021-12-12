package java_basic_test;

public class MainClass {
	public static void main(String[] args) {
		ChildClass child1 = new ChildClass();
		child1.name ="jun";
		child1.gender = "M";
		child1.age = 50;
		
		child1.getInfo();
		
		ChildClass child2 = new ChildClass();
		child2.setInfo("park", "M", 50);
		child2.getInfo();
		
		child2.good();
	}
}
