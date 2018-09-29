package offer2018.baicizhan;


import java.util.*;
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] week = new int[n];
        for(int i = 0; i < n; i++){
            week[i] = in.nextInt();
        }

        Arrays.sort(week);

        if(n == 7) {
            System.out.println("1-7");
            return;
        }
        String res = "";
        int cnt = 1;
        int i = 0;
        int j = 1;
        while(i < n && j < n){
            while(j != n - 1 && week[j + 1] - week[j] == 1){
                j++;
            }
            if(j - i >= 3){
                res += week[i] + "-" + week[j];
            } else if(j - i == 2) {
                res += week[i] + " " + week[i + 1] + " " + week[j + 2];
            } else if (j - i == 1) {
                res += week[i] + " " + week[i + 1];
            } else if (i == j) {
                res += week[i];
            }
            if (j != n - 1) {
                res += " ";
            }
            j++;
            i = j;
        }
        System.out.println(res);
    }


}