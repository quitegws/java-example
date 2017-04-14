package lintcode;

import java.util.Scanner;

public class AddDigits {
    /**
     * @param num a non-negative integer
     * @return one digit
     */
   public static int addDigits(int num) {
       // Write your code here
	   int result = 0;
	   if (num >= 0 && num <= 9){
		   return num;
	   }
	   String s = String.valueOf(num);
	   int digits = s.length();
	   for (int i = 0; i < digits; i++){
		   int tmp = Integer.parseInt(""+ s.charAt(i));
		   result += tmp;
	   }
	   
	   return addDigits(result);
   }
   public static void main(String...args){
	   System.out.println("please input an integer");
	   Scanner s = new Scanner(System.in);
	   int num = s.nextInt();
	   System.out.println("addDigits result is : " + addDigits(num));
   }
}
