package array;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,2,0,3,0,4,0,0,0,2,3,4,0};
		moveZeroes(a);
		utils.PrintUtils.printArray(plusOne(new int[]{0}), "a");
	}
	
    public static void moveZeroes(int[] nums) {
        // Write your code here
    	if (nums == null || nums.length <=1) {
    		return;
    	}
    	int len = nums.length;
    	for (int i = 0; i < len; i++) {
    		if (nums[i] == 0) {
    			moveToEnd(nums, i);
    			i = i - 1;
    			len--;
    		}
    	}
    }
    public static void moveToEnd(int[] a, int i){
    	if (a == null || a.length <= 1) {
    		return;
    	}
    	if (i == a.length) {
    		return;
    	}
    	
    	int tmp = a[i];
    	for (int j = i; j < a.length - 1; j++) {
    		a[j] = a[j + 1];
    	}
    	a[a.length - 1] = tmp;
    }
    public static int[] plusOne(int[] digits) {
        // Write your code here
        boolean flag = true;
        int len = digits.length;
        for (int i = 0; i < len; i++) {
            if (digits[i] == 9) {
                continue;
            }else{
                flag = false;
                break;
            }
        }
        int[] a;
        if (flag) {
            a = new int[len + 1];
            a[0] = 1;
            return a;
        } else {
            int carry = 1;
            for (int j = len - 1; j >= 0; j--) {
                int c = (digits[j] + carry) / 10;
                digits[j] = (digits[j] + carry) % 10;
                carry = c;
            }
            return digits;
        }
    }
}
