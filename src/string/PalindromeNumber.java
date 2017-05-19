package string;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 898989;
		System.out.println(palindromeNumber(n));
	}
    /**
     * @param num a positive number
     * @return true if it's a palindrome or false
     */
    public static boolean palindromeNumber(int num) {
        // Write your code here
    	String s = String.valueOf(num);
    	
    	StringBuilder sb = new StringBuilder(s);
    	sb = sb.reverse();
    	
    	if (sb.toString().equals(s)) {
    		return true;
    	} else {
    		return false;
    	}
    }

}
