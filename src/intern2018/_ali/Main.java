package intern2018._ali;

import java.util.*;

public class Main{

    public static int min = Integer.MAX_VALUE;


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] locations = new int[n][2];
        for(int i = 0; i < n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            locations[i][0] = a;
            locations[i][1] = b;
        }

        boolean[] flags = new boolean[n];
        int distance = 0;
        bt(0,locations,flags,distance,0);
        System.out.println(min);
    }

    public static void bt(int index, int[][] locations, boolean[] flags,int distance, int j){
        int n = flags.length;

        if (n == j + 1) {
            distance += Math.abs(locations[index][0]) + Math.abs(locations[index][1]);
            min =  Math.min(distance, min);
            return;
        }
        flags[index] = true;

        for (int i = 0; i < n; i++) {
            distance += getDis(index, i, locations);
            bt(i,locations,flags, distance, j+1);
//            min = Math.min(distance, min);
        }
        flags[index] = false;

        return ;
    }
    private static int getDis(int p1, int p2, int[][] locations) {
         return Math.abs(locations[p1][0] - locations[p2][0]) + Math.abs(locations[p1][1] - locations[p2][1]);

    }
}
////输入:
//4 2 2 2 8 4 4 7 2
//2,2
//2,8
//4,4
//7,2
////输出:
////30