import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 20/03/2018 19:20
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            int cur = scanner.nextInt();
            nums[i] = cur;
        }

        Arrays.sort(nums);
        int sum = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;

        for (int i = count - 1; i > 0; i--) {
            int cur = nums[i];
            if (cur == 1) {
                c1++;
            } else if (cur == 2) {
                c2 ++;
            } else if (cur == 3) {
                c3++;
            } else if (cur == 4) {
                c4++;
            }
        }

        sum += c4;
        sum += (c2 / 2);
        int left2 = c2 % 2;


        if (c1 > c3) {
            sum += c3;
            int totalLeft = c1 - c3 + 2 * left2;
            sum += Math.ceil(Double.valueOf(""+totalLeft) / 4.0D);

        } else if (c1 == c3) {
            sum += c1;
        } else if (c1 < c3) {
            sum += c1;
            sum += left2;
            sum += c3 - c1;
        }

        System.out.println(sum);
    }
}
