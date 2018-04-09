package _toutiao;

import java.util.*;

/**
 * @Author: gws
 * @Date: 24/03/2018 19:52
 * @Description:
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        HashSet<Integer> setn = new HashSet<>();
        HashSet<Integer> setm = new HashSet<>();
        int summ = 0;
        int sumn = 0;
        int cntn = 0;
        int cntm = 0;



        for (int i = 0; i <n ; i++) {
            int cur = in.nextInt();
            if (!setn.contains(cur)) {
                setn.add(cur);
                cntn++;
                sumn += cur;
            }
        }

        for(int i = 0; i < m; i++){
            int cur = in.nextInt();
            if (!setm.contains(cur)) {
                setm.add(cur);
                cntm++;
                summ += cur;
            }
        }


        int[] numm = new int[setm.size()];
        int[] numn = new int[setn.size()];
        int ii = 0;
        int jj = 0;
        for(int num:setm){
            numm[ii++] = num;
        }
        for(int num:setn){
            numn[jj++] = num;
        }

        Arrays.sort(numm);
        Arrays.sort(numn);


        double avgmd = Double.valueOf(String.valueOf(summ)) / Double.valueOf(String.valueOf(cntm));
        double avgnd = Double.valueOf(String.valueOf(sumn)) / Double.valueOf(String.valueOf(cntn));




        int res = 0;

        System.out.println(res);
    }

    public static double getAvarage(HashSet<Integer> setn){
        int sum = 0;
        for (int i : setn) {
            sum += i;
        }
        return Double.valueOf(String.valueOf(sum)) / Double.valueOf(String.valueOf(setn.size()));
    }
}
