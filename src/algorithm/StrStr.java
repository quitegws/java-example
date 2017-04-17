package algorithm;

public class StrStr {

    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public static int strStr(String source, String target) {
        // write your code here
    	if (source == null || target == null) {
    		return -1;
    	}
        int len1 = source.length();
        int len2 = target.length();
        
        if (len1 <= len2) {
            if (len1 == len2) {
                if (source.equals(target)) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
        
        for (int i = 0; i <= (len1 - len2); i++) {
            if (source.substring(i, len2 + i).equals(target)) {
            	return i;
            }
        }
        return -1;
    }
    
    public static void main(String...args){
    	System.out.println(strStr("ada","da"));
    }
}
