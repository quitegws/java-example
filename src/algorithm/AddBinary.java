package lintcode;

import java.util.Scanner;

public class AddBinary {
	
	public static void main(String...args){
		System.out.println("please input first binary string");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		System.out.println("please input second binary string");
		String b = s.nextLine();
		
		System.out.println(addBinary(a, b));
	}

    public static String addBinary(String a, String b) {
        // Write your code here
    	StringBuilder sb = new StringBuilder();
    	int indexOfA = a.indexOf("1");
    	int indexOfB = b.indexOf("1");
        if (indexOfA >= 0){
        	a = a.substring(indexOfA);
        }else{
        	a = "0";
        }
        if (indexOfB >= 0){
        	b = b.substring(indexOfB);
        }else{
        	b = "0";
        }
        if (a == "0"){
            return b;
        }
        if (b == "0"){
            return a;
        }
        
        int alen = a.length();
        int blen = b.length();
        
        if (alen != blen){
        	if (alen < blen){
        		int dif = blen - alen;
        		for (int i = 0; i < dif; i++) sb.append("0");
        		a = sb.toString() + a;
        	}else{
        		int dif = alen - blen;
        		for (int i = 0; i < dif; i++) sb.append("0");
        		b = sb.toString() + b;
        	}
        }
        alen = a.length();
        blen = b.length();
        char[] achars = a.toCharArray();
        char[] bchars = b.toCharArray();
        char[] result = new char[alen];
        
        int carry = 0;
        
        for(int i = alen - 1; i >= 0; i--){
            int aval = Integer.parseInt("" + achars[i]);
            int bval = Integer.parseInt("" + bchars[i]);
            int tmp = carry + aval + bval;
            
            switch (tmp) {
                case 0 :
                    carry = 0;
                    result[i] = '0';
                    break;
                case 1 :
                    carry = 0;
                    result[i] = '1';
                    break;
                case 2 :
                    carry = 1;
                    result[i] = '0';
                    break;
                case 3 :
                    carry = 1;
                    result[i] = '1';
                    break;
                default : break;
            }
        }
        
        sb = new StringBuilder();
        for (int i = 0; i < alen; i++){
        	sb = sb.append(result[i]);	
        }
        if (carry != 0){
        	return "1" + sb;
        }
        return sb.toString();
    }
}
