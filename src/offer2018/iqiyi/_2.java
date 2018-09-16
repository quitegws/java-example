package offer2018.iqiyi;

import java.util.*;

public class _2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int P = s.nextInt();

        int[] foods = new int[N];
        for(int i = 0; i < N; i++) {
            foods[i] = s.nextInt();
        }

        for(int i = 0; i < M; i++) {
            String ab = s.next();
            int cnt = s.nextInt();
            if(ab.equals("A")){
                foods[cnt - 1]++;
            } else {
                foods[cnt - 1]--;
            }
        }
        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            Pair p = new Pair(i + 1, foods[i]);
            list.add(p);
        }

        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.cnt - o2.cnt;
            }
        });
        int index = 1;
        int lastCnt = list.get(0).cnt;
        int total = 1;

        for(int i = 0; i < list.size(); i++){
            Pair p = list.get(i);

            if (i == 0) {
                lastCnt = p.cnt;
            } else {
                if (lastCnt == p.cnt) {
                    index = i + 1;
                } else {
                    index ++;
                }
                lastCnt = p.cnt;
            }
            if(p.p == P){
                System.out.println(index);
                return;
            }
        }

    }
    static class Pair{
        int p ;
        int cnt;

        public Pair(int p, int cnt) {
            this.p = p;
            this.cnt = cnt;
        }
    }
}