package string;

/**
 * @Author: gws
 * @Date: 26/08/2018 15:44
 * @Description:
 */
public class ReverseSentence {
    public static void main(String[] args) {
        String s = "student. a am   I";
        System.out.println(s);
        System.out.println(reverseSentence1(s));
    }

    public static String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;
        }
        String[] a = str.split(" ");
        StringBuffer o = new StringBuffer();
        int i;
        for (i = a.length; i >0;i--){
            o.append(a[i-1]);
            if(i > 1){
                o.append(" ");
            }
        }
        return o.toString();
    }

    public static String reverseSentence1(String str) {
        String res = "", tmp = "";
        for( int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == ' ') {
                res = " " + tmp + res;
                tmp = "";
            } else {
                tmp += str.charAt(i);
            }
        }
        if(tmp.length() > 0) res = tmp + res;
        return res;
    }

    public static String reverseSentence(String s){
        if (s == null || s.length() <= 1) {
            return s;
        }
        int len = s.length();
        char[] chars = new char[len];

        for (int i = 0; i < len; i++) {
            chars[len - 1 - i] = s.charAt(i);
        }

        int l = 0;
        int index = 0;
        while (l < len) {
            if (chars[l] == ' ') {
                if (l > index) {
                    reverse(chars, index, l - 1);

                }
                l++;
                index = l;

            } else {
                l++;
            }
        }
        reverse(chars, index, l - 1);
        return String.valueOf(chars);
    }

    public static void reverse(char[] chars, int begin, int end){
        if (chars == null || begin > end || begin > chars.length || end < 0) {
            return ;
        }
        while (begin <= end) {
            char temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            end--;
            begin++;
        }
    }
}
