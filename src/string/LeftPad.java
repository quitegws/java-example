package string;

public class LeftPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(leftPad("foo", 2, '*'));
	}
//	leftpad("foo", 5)
//	>> "  foo"
//
//	leftpad("foobar", 6)
//	>> "foobar"
//
//	leftpad("1", 2, "0")
//	>> "01"
    /**
     * @param originalStr the string we want to append to with spaces
     * @param size the target length of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size) {
        // Write your code here
    	if (originalStr == null || originalStr.length() == 0) {
    		return "";
    	}
    	if (size < originalStr.length()) {
    		return originalStr;
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < size - originalStr.length(); i++) {
    		sb.append(" ");
    	}
    	sb.append(originalStr);
    	
    	return sb.toString();
    }

    /**
     * @param originalStr the string we want to append to
     * @param size the target length of the string
     * @param padChar the character to pad to the left side of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size, char padChar) {
        // Write your code here
    	if (originalStr == null || originalStr.length() == 0) {
    		return "";
    	}
    	if (size < originalStr.length()) {
    		return originalStr;
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < size - originalStr.length(); i++) {
    		sb.append(padChar);
    	}
    	sb.append(originalStr);
    	
    	return sb.toString();
    }
}
