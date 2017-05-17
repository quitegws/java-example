package string;

public class CountAndSay {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        // Write your code here
    }
    public String countAndSay(String s){
    	if (s.equals("")) {
    		return "";
    	}
    	if (s.equals("1")){
    		return "11";
    	}
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
        	if (i < chars.length - 1) {
        		if (chars[i] == '1' && chars[i + 1] == '1') {
        			sb.append("21");
        			continue;
        		}
        	}
        	if
        }
        
    }
    
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    }
}