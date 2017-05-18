package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BigIntegerAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(addStrings("1", "19999999"));
//		System.out.println(lengthOfLastWord("  "));
//		String[] dictionary = new String[]{"like", "love", "hate", "yes"};
//		utils.PrintUtils.printList(longestWords(dictionary));
//		ArrayList list = new ArrayList<>();
//		int[] data = new int[]{1,2,3,4,5,1,1,1,1,1};
//		for (int i = 0; i < data.length; i++) {
//			list.add(data[i]);
//		}
		
		System.out.println(checkPowerOf2(8));
	}
    /**
     * @param num1 a non-negative integers
     * @param num2 a non-negative integers
     * @return return sum of num1 and num2
     */
    public static String addStrings(String num1, String num2) {
        // Write your code here
        if (num1.equals("")) {
            return num2;
        }
        if (num2.equals("")) {
        	return num1;
        }
        
        int len1 = num1.length();
        int len2 = num2.length();
        
        int i = len1 - 1;
        int j = len2 - 1;
        
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (j >= 0 && i >= 0) {
        	int n1 = Integer.parseInt(num1.charAt(i) + "");
        	int n2 = Integer.parseInt(num2.charAt(j) + "");
        	
        	int n3 = n1 + n2 + carry;
        	carry = n3 / 10;
        	n3 = n3 % 10;
        	sb.append(n3);
        	
        	i--;
        	j--;
        }
        
        while (i >= 0) {
        	int n1 = Integer.parseInt(num1.charAt(i) + "");
        	int n3 = n1 + carry;
        	carry = n3 / 10;
        	n3 = n3 % 10;
        	sb.append(n3);
        	
        	i--;
        }
        
        while (j >= 0) {
        	int n2 = Integer.parseInt(num2.charAt(j) + "");
        	int n3 = n2 + carry;
        	carry = n3 / 10;
        	n3 = n3 % 10;
        	sb.append(n3);
        	
        	j--;
        }
        
        if (carry == 1) {
        	sb.append(1);
        }
        
        return sb.reverse().toString();
    }

    public static int lengthOfLastWord(String s) {
        // Write your code here
        if (s == null || s.length() == 0) {
        	return 0;
        }
        
        String[] strings = s.split("\\s");
        if (strings == null || strings.length == 0) {
        	return 0;
        }
        return strings[strings.length - 1].length();
    }

    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public static ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
    	if (dictionary == null || dictionary.length == 0) {
    		return new ArrayList<>();
    	}
    	
    	ArrayList<String> list = new ArrayList<String>();
    	int max = Integer.MIN_VALUE;
    	
    	for (int i = 0; i < dictionary.length; i++) {
    		if (dictionary[i].length() > max) {
    			max = dictionary[i].length();
    			list = new ArrayList<String>();
    			list.add(dictionary[i]);
    		} else if (dictionary[i].length() == max) {
    			list.add(dictionary[i]);
    		}
    	}
    	
    	return list;
    	
    }
    
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public static int majorityNumber(ArrayList<Integer> nums) {
        // write your code
    	int size = nums.size();
    	if (size == 1) {
    		return nums.get(0);
    	}
    	Collections.sort(nums);;
    	int sum = 1;
    	for (int i = 1; i < size; i++) {
    		int cur = nums.get(i);
    		int prv = nums.get(i - 1);
    		if (cur == prv) {
    			sum++;
    			if (sum > size / 2) {
    				return cur;
    			}
    		} else {
    			sum = 1;
    		}
    	}
    	return 0;
    }

    public static boolean checkPowerOf2(int n) {
        // write your code here

    	if (n <= 1) {
    		return false;
    	}
    	return (n & n - 1) == 0;
    }
    
}
