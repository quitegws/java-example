package offer2018.changyou;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int res = 0;
        String line = s.nextLine();
        String[] numbers = line.split("\\s");
        int n = numbers.length;
        int sum = (n - 2) * (n - 1) / 2;
        for(int i = 0; i < numbers.length; i++){
            int num = Integer.parseInt(numbers[i]);
            res += num;
        }
        System.out.println(res - sum);
    }
}