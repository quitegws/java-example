package string;

public class InterleavingString {
    /*
     * @param : A string
     * @param : A string
     * @param : A string
     * @return: Determine whether s3 is formed by interleaving of s1 and s2
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
    	if (s1 == null || s2 == null || s3 == null) {
    		return false;
    	}
    	int len1 = s1.length();
    	int len2 = s2.length();
    	int len3 = s3.length();
    	if (len1 + len2 != len3) {
    		return false;
    	}
    	if (len1 == 0) {
    		if (s2.equals(s3)) {
    			return true;
    		} else {
    			return false;
    		}
    	}
    	if (len2 == 0) {
    		if (s1.equals(s3)) {
    			return true;
    		} else {
    			return false;
    		}
    	}
    	
    	if (s1.charAt(0) == s3.charAt(0)) {
    		if (isInterleave(s1.substring(1), s2, s3.substring(1))) {
    			return true;
    		}
    	}
    	
    	if (s2.charAt(0) == s3.charAt(0)) {
    		if (isInterleave(s1, s2.substring(1), s3.substring(1))) {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    public static void main(String[] args) {
    	System.out.println(new InterleavingString().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    
    }
    
}