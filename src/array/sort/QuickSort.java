package array.sort;

/**
 * @Author: gws
 * @Date: 12/05/2018 22:52
 * @Description:
 */
public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] a = new int[]{1,2,0,4,1,6,55,3};
        quickSort.quickSort(a,0,a.length - 1);
        utils.PrintUtils.printArray(a,"a");
    }

    public void quickSort(int[] nums, int low, int high){
        if (low >= high) {
            return;
        }

        int key = partition(nums, low,high);
        quickSort(nums, low, key - 1);
        quickSort(nums, key + 1, high);
    }

    public int partition(int[] nums, int low, int high){
        int key = nums[low];
        int i = low;
        int j = high;

        while (i < j){
            while (i < j && key <= nums[j]) {
                j--;
            }
            nums[i] = nums[j];

            while (i < j && key >= nums[i]) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = key;
        return i;
    }


}
