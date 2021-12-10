package java_basic_test;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = null;
		int arr3[] = null;
		
		System.out.println("length of arr1 is "+arr1.length);
		System.out.println("value of index is "+Arrays.toString(arr1));
		
		arr2 = Arrays.copyOf(arr1,arr1.length);
		System.out.println("value of index is "+Arrays.toString(arr2));
		System.out.println("address of arr2 is "+arr2);
		System.out.println("address of arr1 is "+arr1); //address of arr1 is different its arr2
		
		arr3 = arr1;
		System.out.println("address of arr3 is"+arr3);
		System.out.println("address of arr1 is"+arr1); // address of arr1 is same its arr3
		
		
		int[][] arr4 = new int[2][2];
		arr4[0][0] = 1;
		arr4[0][1] = 2;
		arr4[1][0] = 3;
		arr4[1][1] = 4;
		
		System.out.println(arr4[0][0]);
		System.out.println(arr4[0][1]);
		System.out.println(arr4[1][0]);
		System.out.println(arr4[1][1]);
	}
}
