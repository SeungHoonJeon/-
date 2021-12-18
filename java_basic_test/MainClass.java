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
			byte[] bs = new byte[3];
			
			while(true) {
				try {
					data = inputStream.read(bs); //3byte¾¿ ÀÐ¾î¿È.
				}catch(IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println("data : " + data);
				for(int i=0; i<bs.length;i++) {
					System.out.println("bs["+i+"]:"+bs[i]);
				}
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
