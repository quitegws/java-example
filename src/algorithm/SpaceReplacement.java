package algorithm;

public class SpaceReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "hello world! hello again ... jfadjflkjas  falsdjf asjd kdj";
		int length = string.length();
		char[] chars = new char[length * 2];
		for (int i = 0; i < length; i++) {
			chars[i] = string.charAt(i);
		}
		
		replaceBlank(chars, length);
		
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}

    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public static int replaceBlank(char[] string, int length) {
        // Write your code here
    	int spaces = 0;
    	for (int i = 0; i < length; i++) {
    		if (string[i] == ' ') {
    			
    			spaces++;
    			fallback2(string, i, length);
    			string[i] = '%';
    			string[i + 1] = '2';
    			string[i + 2] = '0';
    			length += 2;
    			i += 2;
    		}
    	}
    	
    	return length;
    }
    
    public static void fallback2(char[] string, int i, int length){
    	if (i >= length) {
    		return;
    	}
    	for (int j = length - 1; j > i; j--) {
    		string[j + 2]= string[j];
    	}
    }
}
