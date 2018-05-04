package binary;

/**
 * @Author: gws
 * @Date: 23/04/2018 22:28
 * @Description:
 */
public class FindComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        int mask = 1;
        int tmp = num;
        while (tmp != 0) {
            tmp >>= 1;
            mask <<= 1;
        }
        return num ^ (mask - 1);
    }
}
