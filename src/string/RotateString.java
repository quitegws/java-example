package string;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
    	if (str == null || offset == 0 || str.length <= 1) {
    		return;
    	}
    	int len = str.length;
    	for (int i = 0; i < offset; i++) {
    		char last = str[len - 1];
    		for (int j = len - 1; j > 0; j--) {
    			str[j] = str[j - 1];
    		}
    		str[0] = last;
    	}
    }
}
