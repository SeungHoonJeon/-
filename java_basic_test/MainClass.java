package java_basic_test;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println("arr[2]:"+arr[2]);
		System.out.println("arr[3]:"+arr[3]);
		System.out.println("arr[4]:"+arr[4]);
		//System.out.println("arr[0]:"+arr[5]); //err: Index 5 out of bounds for length 5
		
		String[] name = {"������","������","���Ѽ�","������","�ڱ���","����"};
		int[] score = new int[6];
		float avg;
		Scanner input = new Scanner(System.in); 
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. :",name[0]);
		score[0] = input.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. :",name[1]);
		score[1] = input.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. :",name[2]);
		score[2] = input.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. :",name[3]);
		score[3] = input.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. :",name[4]);
		score[4] = input.nextInt();
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�. :",name[5]);
		score[5] = input.nextInt();
		
		System.out.printf("%s ���� : %d \n", name[0], score[0]);
		System.out.printf("%s ���� : %d \n", name[1], score[1]);
		System.out.printf("%s ���� : %d \n", name[2], score[2]);
		System.out.printf("%s ���� : %d \n", name[3], score[3]);
		System.out.printf("%s ���� : %d \n", name[4], score[4]);
		System.out.printf("%s ���� : %d \n", name[5], score[5]);
		
		avg = (float)(score[0]+score[1]+score[2]+score[3]+score[4]+score[5]);
		System.out.printf("-------------��� : %.2f \n",avg);
		
		input.close();
		
	}
}
