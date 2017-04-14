package lintcode;

import java.util.Scanner;

public class CountOnes {
    public static int countOnes(int num) {
        // write your code here
    	int result = 0;
    	String binaryNum = Integer.toBinaryString(num);
    	char[] a = binaryNum.toCharArray();
    	int len = a.length;
    	for (int i = 0; i < len; i++){
    		if (a[i] == '1'){
    			result++;
    		}
    	}
    	return result;
    }
    public static void main(String...args){
 	   System.out.println("please input an integer");
 	   Scanner s = new Scanner(System.in);
 	   int num = s.nextInt();
 	   System.out.println("CountOnes result is : " + countOnes(num));
    }
}
