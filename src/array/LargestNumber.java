package array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestNumber(new int[]{41,23,87,55,50,53,18,9,39,63,35,33,54,25,26,49,74,61,32,81,97,99,38,96,22,95,35,57,80,80,16,22,17,13,89,11,75,98,57,81,69,8,10,85,13,49,66,94,80,25,13,85,55,12,87,50,28,96,80,43,10,24,88,52,16,92,61,28,26,78,28,28,16,1,56,31,47,85,27,30,85,2,30,51,84,50,3,14,97,9,91,90,63,90,92,89,76,76,67,55}));
	}

    /**
     *@param num: A list of non negative integers
     *@return: A string
     */
    public static String largestNumber(int[] num) {
        // write your code here
    	String[] strs = new String[num.length];
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < num.length; i++) {
    		strs[i] = String.valueOf(num[i]);
    	}
    	Arrays.sort(strs,new NumbersComparator());
    	if (strs[strs.length - 1].equals("0")) {
    		return "0";
    	}
    	for (int i = 0; i < strs.length; i++) {
    		System.out.println(strs[i]);
    		sb.append(strs[i]);
    	}
    	
    	
    	return sb.toString();
    }
}
class NumbersComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return (s2 + s1).compareTo(s2 + s1);
	}
}
