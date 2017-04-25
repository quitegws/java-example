package algorithm;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("input a number : ");
			int n = s.nextInt();
			System.out.println("n is a ugly number : " + isUgly(n));
			
		}
	}

	public static boolean isUgly(int n){
		
		while(n != 1){
			if (n % 2 == 0) {
				n /=2;
			} else if (n % 3 == 0) {
				n /= 3;
			} else if (n % 5 == 0) {
				n /= 5;
			} else {
				return false;
			}
		}
		return true;
	}
}
