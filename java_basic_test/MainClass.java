package java_basic_test;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s[] = {"������","������","������","���Ѽ�","�ڱ���","����"};
		int[] score = new int[6];
		
		score[0] = 50;
		score[1] = 60;
		score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		score[5] = 100;
		
		if(score[0] >= score[1]) {
			System.out.println("�������� ���������� ������ �� �����ϴ�.");
		}else {
			System.out.println("�������� �����ƺ��� ������ �� �����ϴ�.");
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
