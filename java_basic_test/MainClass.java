package java_basic_test;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s[] = {"������","������","������","���Ѽ�","�ڱ���","����"};
		int[] score = new int[6];
		
		for(int i=0;i<6;i++) {
			System.out.printf("%s�� ���� : ", s[i]);
			score[i] = input.nextInt();
			switch(score[i]) {
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
		int j = 0;
		while(j<10) {
			System.out.printf("%d * %d = %d \n", 6,j,(6*j));
			j++;
		}
		
		
	}
}
