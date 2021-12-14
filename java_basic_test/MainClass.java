package java_basic_test;

public class MainClass {
	public static void main(String[] args) {
		Student student1 = new Student("전승훈",10);
		student1.getinfo();
		
		student1.setScore(40);//50이상 안전장치가 걸려있는데 40이면 설정이 안됨.
		student1.getinfo();
	}
}
