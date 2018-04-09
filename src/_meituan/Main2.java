package _meituan;


import java.util.*;
import java.math.BigInteger;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();


        int[] cnts = new int[10];
        for (int i = 0; i< number.length(); i++) {
            int cur = Integer.valueOf(""+number.charAt(i));
            cnts[cur] = cnts[cur] + 1;
        }

//        long i = 1;
        BigInteger  x = new BigInteger("1");

        while(true){
            String s = String.valueOf(x.toString());

            int[] counts = new int[10];

            for (int j = 0; j < s.length(); j++) {
                int cur = Integer.valueOf(""+s.charAt(j));
                counts[cur] = counts[cur] + 1;
            }

            for(int k = 0; k < 10; k++){
                if (counts[k] > cnts[k]) {
                    System.out.println(x);
                    return;
                }
            }
            x=x.add(new BigInteger("1"));
        }

    }
}
