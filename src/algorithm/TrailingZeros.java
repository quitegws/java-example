package algorithm;

import java.math.BigDecimal;
public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(35) + " : "+trailingZeros(35));
	}
    public static long trailingZeros(long n) {
        // write your code here
    	long sum = 0;
    	while (n != 0) {
    		sum += n / 5;
    		n /= 5;
    	}
    	return sum;
    }
    
    public static long fun(long n){
    	long sum = 1;
    	for (long i = 1; i <= n; i++) {
    		sum *= i;
    	}
    	return sum;
    }
    
}
