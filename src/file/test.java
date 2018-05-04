package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;

public class test {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String base = "/Users/gws/Desktop/testwatchdir/";
		String fileName = "file.test.txt";
		

		while (true) {
			Thread.sleep(2000);
			createFile(base, fileName);
			
			Thread.sleep(5000);
			modifyFile(base, fileName);
			
			Thread.sleep(5000);
			deleteFile(base, fileName);
			
		}
		
		
		
		
	}
	
	public static void modifyFile(String base, String fileName) throws IOException{
		File file = new File(base + fileName);
		if (file.exists()) {
			BufferedWriter out = new BufferedWriter (new OutputStreamWriter(new FileOutputStream(file)));
			
			out.write("modify file on : " + new Date().toString());
			
			out.close();
		}
	}
	
	public static void createFile(String base, String fileName) throws IOException{
		File file = new File(base + fileName);
		BufferedWriter out = new BufferedWriter (new OutputStreamWriter(new FileOutputStream(file)));
		
		out.write("create file : " + base + fileName);
		
		out.close();
	}
	
	public static void deleteFile(String base, String fileName){
		File file = new File(base + fileName);
		if (file.exists()) {
			file.delete();
		}
	}
	
	
	
	public static void test() throws IOException{
		
		Process p = Runtime.getRuntime().exec("ps -ef ");
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String s = null;
		while (( s = br.readLine()) != null) {
			System.out.println(s);
		}
		System.out.println("/n");
		
	}

}
