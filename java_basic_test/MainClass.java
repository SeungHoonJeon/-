package java_basic_test;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("list.size : "+list.size());
		
		list.add("hello");
		list.add("Java");
		list.add("World");
		System.out.println("list.size : " + list.size());
		System.out.println("list: "+ list);
		
		list.add(2,"Programming");
		System.out.println("list : "+ list);
		
		list.set(1, "C");
		System.out.println("list : " + list);
		
		String str = list.get(2);
		System.out.println("list.get(2) : " + str);
		System.out.println("list: " + list);
		
		str = list.remove(2);
		System.out.println("list.remove(2) : "+ str);
		System.out.println("list : " + list);
		
		list.clear();
		System.out.println("list: " + list);
		
		boolean b = list.isEmpty();
		System.out.println("list.isEmpty(): "+b);
		
	}
}
