package string;

public class CountAndSay {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public static String countAndSay(int n) {
    	StringBuilder target = new StringBuilder("1");
    	StringBuilder tmp = new StringBuilder();
    	int j = 0;
    	for (int i = 1; i < n; i++) {
    		int len = target.length();
    		while (j < len) {
    			if (j < len - 1) {
    				if (target.substring(j, j + 2).equals("11")) {
    					tmp.append("21");
    					j += 2;
    					continue;
    				}
    				tmp.append("1");
    				tmp.append(target.charAt(j));
    				j++;
    				
    			} else if (j == len - 1) {
    				tmp.append("1");
    				tmp.append(target.charAt(j));
    				j++;
    			}
    		}
    		target = tmp;
    		tmp = new StringBuilder();
    		j = 0;
    	}
    	return target.toString();
    }

    //AcceptedOne
    public static String countAndSay2(int n){
    	StringBuilder target = new StringBuilder("1");
    	StringBuilder tmp = new StringBuilder();
    	int j = 0;
    	for (int i = 1; i < n; i++) {
    		int len = target.length();
    		while (j < len) {
    			char firstChar = target.charAt(j);
    			int k = j;
    			int cnt = 0;
    			while (k < len && target.charAt(k++) == firstChar) {
    				cnt++;
    			}
    			tmp.append("" + cnt + firstChar);
    			j += cnt;
    		}
    		target = tmp;
    		tmp = new StringBuilder();
    		j = 0;
    	}
    	return target.toString();
    }
    
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	for (int i = 1; i < 9; i++) {
    		System.out.println(countAndSay2(i));
    	}
    }
}