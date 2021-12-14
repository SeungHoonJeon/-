package java_basic_test;

public class Student {
	private String name;
	private int score;
	
	public Student(String n, int s) {
		name = n;
		score = s;
	}
	public void getinfo() {
		System.out.println("name"+name);
		System.out.println("score"+score);
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score>50) this.score = score;
	}	
}
