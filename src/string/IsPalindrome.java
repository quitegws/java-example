package string;

/**
 * @Author: gws
 * @Date: 19/04/2018 09:17
 * @Description:
 */
public class IsPalindrome {

    public static void main(String[] args) {
       System.out.println( new IsPalindrome().isPalindrome("1A man, a plan, a canal: Panama1"));
       System.out.println("A man, a plan, a canal: Panama".toLowerCase().replaceAll("[^a-zA-Z\\d]",""));
       System.out.println("1Panama1".split(" ")[0]);
    }

    public boolean isPalindrome(String s) {
        if (s == null) return true;
        if (s.length() <= 1) return true;

        char[] chars = s.toLowerCase().replaceAll("[^a-zA-Z\\d]","").toCharArray();
        int i = 0, j = chars.length - 1;

        while(i < j){

            if (i < chars.length && j >= 0 && chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
