package intern2018._toutiao;

/**
 * @Author: gws
 * @Date: 14/04/2018 21:14
 * @Description:
 */
public class ReverseWord {
    public static void main(String[] args) {
        String line = "";
        char[] chars = line.toCharArray();
        int begin = 0;
        int end = 0;
        StringBuilder result = new StringBuilder();

        while (begin <= end && end < line.length()) {
            if (chars[end] == ' ' && begin == end) {
                result.append(chars[end]);
                begin ++;
                end ++;
            } else if (chars[end] == ' ' && begin != end){
                result.append(doReverse(chars, begin, end - 1));
                begin = end;
            } else {
                end++;
            }
        }

        if (begin != end)
        result.append(doReverse(chars, begin,end - 1));

        System.out.println(result);
    }

    public static String doReverse(char[] line, int begin, int end){
        if (begin > end || line == null || begin < 0 || end >= line.length) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int index = end; index >= begin; index--) {
            sb.append(line[index]);
        }
        return sb.toString();
    }
}
