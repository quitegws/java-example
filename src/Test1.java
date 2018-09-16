import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 20/03/2018 19:05
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] numbers = line.split("\\+");
        int[] nums = new int[numbers.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(numbers[i]);
            sum += nums[i];
        }

        Arrays.sort(nums);


        String expressions = "";
        int cur = 0;
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            cur = nums[i];
            if (i < nums.length - 1 && cur == nums[i + 1]) {
                cnt++;
            } else {
                expressions+= cur + "*"+ cnt + "+";
                cnt = 1;
            }

        }
        expressions = expressions.substring(0, expressions.length() - 1);


        System.out.println(expressions);
        System.out.println(sum);


        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");

        sb.insert(0,"b");
        System.out.println(sb.toString());
    }
}
