package binarytree;

/**
 * @Author: gws
 * @Date: 22/04/2018 21:37
 * @Description:
 */
public class UniqueBST {
    public static void main(String[] args) {
        UniqueBST uniqueBST = new UniqueBST();
        long s = System.currentTimeMillis();
        System.out.println(uniqueBST.numTrees2(14));
        System.out.println(System.currentTimeMillis() - s);
    }

    //超时
    public int numTrees(int n) {
        return numTrees(1, n);
    }
    public int numTrees(int start, int end){
        if (start > end) return 0;
        if (start == end) return 1;
        if (end - start == 1) return 2;

        int cnt = 0;
        for(int i = start; i<= end; i++){
            int a = numTrees(start, i - 1);
            int b = numTrees(i + 1, end);
            if (a == 0) {
                cnt += b;
            }else if (b == 0) {
                cnt += a;
            }else {
                cnt += a * b;
            }
        }
        return cnt;
    }
    public int numTrees2(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                count[i] += count[j] * count[i - j - 1];
            }
        }
        return count[n];
    }
}
