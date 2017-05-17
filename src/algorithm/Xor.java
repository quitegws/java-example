package algorithm;

import java.util.Scanner;

public class Xor {
	 public static void main(String[] args) {
		 
	  Scanner sc = new Scanner(System.in);
	  System.out.println("请输入第1个字符串！");
	  String s1 = sc.nextLine();
	  System.out.println("请输入第2个字符串！");
	  String s2 = sc.nextLine();
	  System.out.println("请输入第3个字符串！");
	  String s3 = sc.nextLine();
	  
//	  Integer.toBinaryString(i2);
//	  Integer.toBinaryString(i3);
	  int i1 = Integer.valueOf(s1);
	  byte[] result = new byte[i1];
	  int l2 = 0;
	  int l3 = 0;

	  int index = -1;
	  
	  if((index=s2.indexOf("1")) != 0){
		  s2 = s2.substring(index);
	  }
	  if((index=s3.indexOf("1")) != 0){
		  s3 = s3.substring(index);
	  }
	  l2 = s2.length();
	  l3 = s3.length();
	  
	  if(l2>=l3){
		  String tmp = s3;
		  s3 = s2;
		  s2 = tmp;
	  }
	  int max = Integer.max(l2, l3);
	  int min = Integer.min(l2, l3);
	  
	  for(int i = 0; i < min ; i++){
		  if(s2.charAt(min-i-1) == s3.charAt(max-i-1)){
			  result[i1-i-1] = 0;
		  }else{
			  result[min-i-1] = 1;
		  }
	  }
	  for(int i = min ; i<max; i++){
		  result[i] = (byte) s3.charAt(i);
	  }
	  StringBuilder sb = new StringBuilder(); 
	  for(int i = 0; i<max; i++){
		  sb.append(result[i1-max+i]);
	  }
	  if(sb.toString().startsWith("0")){
		  sb = sb.deleteCharAt(0);
	  }
	  System.out.println("result is : " + Integer.valueOf(sb.toString(), 10));
	  }
}