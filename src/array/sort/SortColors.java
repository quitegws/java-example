package array.sort;

import java.util.Arrays;

/**
 * @Author: gws
 * @Date: 04/05/2018 17:22
 * @Description:
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length - 1;
        int i = 0;
        while(i <= two){
            if (nums[i] == 0 && i > zero) {
                swap(nums, i, zero++);
            } else if (nums[i] == 2 && i < two) {
                swap(nums,i,two--);
            } else {
                i++;
            }
        }
    }

    public void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();

        int[] a = new int[]{2,2,1,0,1,2,0,1,1,2,0};

        utils.PrintUtils.printArray(a,"a");
        sortColors.sortColors(a);
        utils.PrintUtils.printArray(a,"a");
    }
}
