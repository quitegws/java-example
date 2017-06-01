package string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ss = {"abcf", "abbbb", "abbb"};
		System.out.println(longestCommonPrefix2(ss));
	}
	public static String longestCommonPrefix2(String[] strs){
		if (strs == null || strs.length == 0) {
			return "";
		}
		int len = strs.length;
		StringBuilder sb = new StringBuilder();
		
		String first = strs[0];
		int j = 0;
		while (j < first.length()) {
			char c = first.charAt(j);
			for (int i = 1; i < len; i++) {
				String s = strs[i];
				if (j < s.length() && s.charAt(j) != c) {
					return s.substring(0, j);
				}
				if (j >= s.length()) {
					return s;
				}
				
			}
			sb.append(c);
			j++;
		}
		
		return sb.toString();
	}
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public static String longestCommonPrefix(String[] strs) {
        // write your code here
    		if (strs == null || strs.length == 0) {
    			return "";
    		}
    		int len = strs.length;
    		String first = strs[0];
    		int j = 0;
    		while (j < first.length()) {
    			char c = first.charAt(j);
    			for (int i = 1; i < len; i++) {
    				String s = strs[i];
    				if (j < s.length() && s.charAt(j) != c) {
    					return first.substring(0, j);
    				}
    				if (s.length() <= j) {
    					return first.substring(0, j);
    				}
    			}
    			j++;
    		}
    		return first;
    }

    
    
}
