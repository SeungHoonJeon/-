package java_basic_test;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s[] = {"전승훈","조윤성","지수용","박한수","박광렬","김경록"};
		int[] score = new int[6];
		
		score[0] = 50;
		score[1] = 60;
		score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		score[5] = 100;
		
		if(score[0] >= score[1]) {
			System.out.println("전승훈이 조윤성보다 성적이 더 높습니다.");
		}else {
			System.out.println("조윤성이 전승훈보다 성적이 더 높습니다.");
		}
		
		switch(score[0]) {
			case 100:
				System.out.println("A+");
				break;
			case 90:
				System.out.println("A");
				break;
			case 80:
				System.out.println("B+");
				break;
			case 70:
				System.out.println("B");
				break;
			case 60:
				System.out.println("C+");
				break;
			case 50:
				System.out.println("C");
				break;
			default:
				System.out.println("F");
				break;
		}
		
	}
}
