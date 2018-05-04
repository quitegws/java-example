package string;

/**
 * @Author: gws
 * @Date: 22/04/2018 20:37
 * @Description:
 */
public class MaxProducts {
    public static void main(String[] args) {
        System.out.println(0b10&0b10);
    }
    public int maxProduct(String[] words) {
        int len = words.length;
        int[] val = new int[len];
        for(int i = 0; i < len; i++){
            for(char c : words[i].toCharArray()){
                val[i] |= 1 << (c - 'a');
            }

        }

        int res = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((val[i] & val[j]) == 0) {
                    res = Math.max(res , words[i].length() * words[j].length());
                }
            }
        }

        return res;
    }
}
