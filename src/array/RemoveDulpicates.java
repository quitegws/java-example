package array;

/**
 * @Author: gws
 * @Date: 17/04/2018 22:05
 * @Description:
 */
public class RemoveDulpicates {
    public static void main(String[] args) {
        int[] nums = {4,5,5,6,6,6,7,7,8};

        // nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
        int len = removeDuplicates(nums);

        System.out.println("len:"+len);
// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums){
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;

        int j = 1;
        int i = 0;
        int len = nums.length;
        int cur = nums[0];
        while(j < len){

            while(j < len && nums[j] == cur){
                j++;
            }
            i++;
            if (i < len && j < len) {
                cur = nums[i] = nums[j];
            }

        }

        return i + 1;
    }
}
