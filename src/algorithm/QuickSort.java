package algorithm;

public class QuickSort {
    /**
     * @param A an integer array
     * @return void
     */
    public static void sortIntegers2(int[] A) {
        // Write your code here
        quickSort(A, 0, A.length - 1);
    }

public static int getMiddle(int[] list, int low, int high) {
    //数组的第一个作为中轴
        int tmp = list[low];
        while (low < high) {  
            while (low < high && list[high] >= tmp) {  
                high--;  
            }
            //比中轴小的记录移到低端
            list[low] = list[high];
            while (low < high && list[low] <= tmp) {  
                low++;  
            }
            //比中轴大的记录移到高端
            list[high] = list[low];
        }
    //中轴记录到尾
        list[low] = tmp;
    //返回中轴的位置
        return low;
    }
    public static void quickSort(int[] list, int low, int high) {  
        if (low < high) {  
            //将list数组进行一分为二
            int middle = getMiddle(list, low, high);
            //对低字表进行递归排序
            quickSort(list, low, middle - 1);
            //对高字表进行递归排序
            quickSort(list, middle + 1, high);
        }
    }
}