package algorithm;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("input a number : ");
		int a = s.nextInt();
		System.out.println("input another number : ");
		int b = s.nextInt();
		System.out.println("sum is : " + aplusb(a, b));
	}
    public static int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
    	while(b != 0){
    		int _a = a ^ b;
    		int _b = (a & b) << 1;
    		a = _a;
    		b = _b;
    	}
    	
    	return a;
    }
}
