package java_basic_test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		InputStream InputStream = null;
		DataInputStream dataInputStream = null;
		OutputStream OutputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			InputStream = new FileInputStream("C:\\Users\\TunaF\\Resilio Sync\\java\\java_baisc_grammer\\java_basic_test\\src\\java_basic_test\\abc.txt");
			dataInputStream = new DataInputStream(InputStream);
			
			String str = dataInputStream.readUTF();
			
			OutputStream = new FileOutputStream("C:\\Users\\TunaF\\Resilio Sync\\java\\java_baisc_grammer\\java_basic_test\\src\\java_basic_test\\abc_copy.txt");
			dataOutputStream = new DataOutputStream(OutputStream);
			
			dataOutputStream.writeUTF(str);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(dataInputStream != null) dataInputStream.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
