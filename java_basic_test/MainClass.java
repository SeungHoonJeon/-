package java_basic_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainClass {
	public static void main(String[] args) {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("C:\\Users\\TunaF\\Resilio Sync\\java\\java_baisc_grammer\\java_basic_test\\src\\java_basic_test\\hello.txt");
			int data = 0;
			
			while(true) {
				try {
					data = inputStream.read();
				}catch(IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println("data : " + data);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(inputStream != null) inputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
