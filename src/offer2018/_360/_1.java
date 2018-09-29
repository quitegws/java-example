package offer2018._360;

import java.util.Arrays;
import java.util.Scanner;

public class _1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0;i<n;i++){
            data[i] = scanner.nextInt();
        }
        int res = 0;
        for(int i = 2;i<n;i++){
            if(isduobianxing(data,i)){
                res = i+1;
                break;
            }

        }
        System.out.println(res);

    }
    public static boolean isduobianxing(int[] data ,int index){
        int[] temp = new int[index+1];
        for(int i = 0;i<=index;i++){
            temp[i] = data[i];
        }
        Arrays.sort(temp);
        int sum = 0;
        for(int j = 0;j<temp.length-1;j++){
            sum = sum + temp[j];
        }
        if(sum>temp[index]){
            return true;
        }
        else{
            return false;
        }
    }

}