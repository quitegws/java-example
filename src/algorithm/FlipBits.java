package algorithm;

public class FlipBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = bitSwapRequired(67, 31);
		System.out.println("" + result + " " + ~7);
		System.out.println(Integer.toBinaryString(7>>>1));
	}

    public static int bitSwapRequired(int a, int b) {
        // write your code here
        int count = 0;  
        for (int c = a ^ b; c != 0; c = c >>> 1) {
            count += c & 1;
        }
        return count;
    }
}
