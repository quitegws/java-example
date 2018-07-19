package string;

/**
 * @Author: gws
 * @Date: 06/05/2018 21:59
 * @Description:输入: "Let's take LeetCode contest"
                输出: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseString3 {

    public static void main(String[] args) {
        ReverseString3 reverseString3 = new ReverseString3();
        System.out.println(reverseString3.reverseWords(" fsf dfd dfa     f   fad "));
    }

    public String reverseWords(String s) {
        char[] cs = s.toCharArray();
        int begin = 0;
        int end = 0;
        int i = 0;
        int len = cs.length;
        while(i < len){
            while(i < len && cs[i] == ' '){
                i++;
                begin++;
                end++;
            }
            end = begin = i++;
            while (i < len && cs[i] != ' ') {
                i++;
                end++;
            }

            while(begin < end){
                swap(cs, begin,end);
                begin++;
                end--;
            }

        }

        return String.valueOf(cs);
    }
    public void swap(char[] cs, int begin, int end){
        if (cs == null || begin < 0 || end > cs.length - 1 || begin > end) return ;
        char tmp = cs[end];
        cs[end] = cs[begin];
        cs[begin] = tmp;
    }
}
