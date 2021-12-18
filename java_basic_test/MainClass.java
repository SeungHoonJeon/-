package java_basic_test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("C:\\Users\\TunaF\\Resilio Sync\\java\\java_baisc_grammer\\java_basic_test\\src\\java_basic_test\\hello1.txt");
			String data = "hello java world!";
			byte[] arr = data.getBytes();
			
			try {
				outputStream.write(arr);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(outputStream != null) outputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
