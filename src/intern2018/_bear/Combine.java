package intern2018._bear;

/**
 * @Author: bear
 * @Date: 08/05/2018 19:06
 * @Description:
 */
public class Combine {
    public static void main(String[] args) {
        Combine combine = new Combine();
        System.out.println(combine.combine("abcdef", "fedha"));
    }
    //time complexity is O(m + n), space complexity is O(m + n)

    public String combine(String a, String b){
        StringBuilder res = new StringBuilder();
        if (a == null || b == null) return null;
        if (a.length() == 0) return b;
        if (b.length() == 0) return a;

        char[] achars = a.toCharArray();
        char[] bchars = b.toCharArray();

        int alen = achars.length;
        int blen = bchars.length;

        int i = alen - 1;
        int j = 0;

        while (i >= 0 && j < blen && achars[i] == bchars[j]) {
            i--;
            j++;
        }
        res.append(achars,0,i + 1);
        res.append(bchars, j, blen - j);

        return res.toString();
    }
}
