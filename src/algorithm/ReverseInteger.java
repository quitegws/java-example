package algorithm;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(""+Integer.parseInt("1111111111111111111111111111111", 2));
		System.out.println("max int is : " + Integer.MAX_VALUE);
		System.out.println("min int is : " + Integer.MIN_VALUE);
		reverseInteger(1534236469);
	}

	public static int reverseInteger(int n) {
		String nStr = String.valueOf(n);
		System.out.println("input integer is : " + nStr);
		boolean isNegative = false;
		if (nStr.startsWith("-")) {
			isNegative = true;
			nStr = nStr.substring(1);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nStr.length(); i++) {
			sb.append(nStr.charAt(nStr.length() - 1 - i));
		}
		try{
			if (isNegative) {
				return Integer.valueOf("-" + sb.toString());
			}
			return Integer.valueOf(sb.toString());
			
		}catch(NumberFormatException e){
			return 0;
		}
	} 
    public int reverseInteger2(int n) {
        int reversed_n = 0;
        
        while (n != 0) {
            int temp = reversed_n * 10 + n % 10;
            n = n / 10;
            if (temp / 10 != reversed_n) {
                reversed_n = 0;
                break;
            }
            reversed_n = temp;
        }
        return reversed_n;
    }
}
