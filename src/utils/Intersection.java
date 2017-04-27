package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Scanner;

public class Intersection {

	public static void main(String...args) throws IOException{
		forceGetIntersection();
		readFile();
	}
	
	public static void readFile() throws FileNotFoundException{
		long startTime = System.currentTimeMillis();
		HashSet<String> set1 = new HashSet<String>();
		File file1 = new File("/Users/gws/Desktop/ip-address.txt");
		Scanner input1 = new Scanner(file1);
		while (input1.hasNext()) {
			set1.add(input1.nextLine());
		}
		input1.close();
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("read file duration is : " + duration + " ms");
	}
	
	public static void forceGetIntersection() throws IOException {
		genIpFiles();
		long startTime = System.currentTimeMillis();
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set1 = new HashSet<String>();
		File file1 = new File("/Users/gws/Desktop/ip-address.txt");
		File file2 = new File("/Users/gws/Desktop/ip-address2.txt");
		File result = new File("/Users/gws/Desktop/ip-address-result.txt");
		OutputStream out = new FileOutputStream(result);
		Scanner input1 = new Scanner(file1);
		Scanner input2 = new Scanner(file2);
		
		while (input1.hasNext()) {
			set1.add(input1.nextLine());
		}
		
		while (input2.hasNext()) {
			String tmp = input2.nextLine();
			if (set1.contains(tmp)) {
				out.write((tmp + "\n").getBytes());
			}
		}
		out.close();
		input1.close();
		input2.close();

		long endTime = System.currentTimeMillis();
		System.out.println("find intersection duration is : " + (endTime - startTime) + " ms");
	}
	
	public static void genIpFiles() throws IOException{
		long startTime = System.currentTimeMillis();
		long i = 0;
		File file = new File("/Users/gws/Desktop/ip-address.txt");
		File file2 = new File("/Users/gws/Desktop/ip-address2.txt");
		OutputStream out = new FileOutputStream(file);
		OutputStream out2 = new FileOutputStream(file2);
		
		for (; i < 1000000; i++) {
			String ip = (int)(Math.random() * 256) + "." + (int)(Math.random() * 256) + "." 
						+ (int)(Math.random() * 256) + "." + (int)(Math.random() * 256);
			out.write((ip + "\n").getBytes());
			String ip2 = (int)(Math.random() * 256) + "." + (int)(Math.random() * 256) + "." 
					+ (int)(Math.random() * 256) + "." + (int)(Math.random() * 256);
			out2.write((ip2 + "\n").getBytes());
		}
		out.close();
		out2.close();
		long endTime = System.currentTimeMillis();
		System.out.println("generate two random ip-address files duration is : " + (endTime - startTime) + " ms");
	}
}
