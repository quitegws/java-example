package array;

import java.util.ArrayList;
import java.util.Iterator;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{3,4,5,1,2};
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		utils.PrintUtils.printList(list);;
//		System.out.println(recoverRotatedSortedArray(list));
		recoverRotatedSortedArray(list);
		utils.PrintUtils.printList(list);
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

    public static int removeDuplicates(int[] nums) {
        // write your code here
    	if (nums == null || nums.length == 0) {
    		return 0;
    	}
    	if (nums.length == 1) {
    		return 1;
    	}
    	int i = 0;
    	int j = 1;
    	int len = nums.length;
    	int cur = 0;
    	while (i < len && j < len) {
    		cur = nums[i];
    		while (j < len && cur != nums[j]) {
    			j++;
    			i++;
    			cur = nums[i];
    		}
    		while (j < len && cur != nums[j]) {
    			j++;
    		}
    		for (int k = j; k < len; k++) {
    			nums[k + i - j] = nums[k];
    			
    		}
    		if (i != j) {
    			len -= j - i;
    		}
    	}
    	return j;
    	
    }// 1,2,2,3

    public static int removeDuplicates2(int[] num){
    	if (num == null || num.length == 0) {
    		return 0;
    	}
    	int size = 0;
    	for (int i = 0; i < num.length; i++) {
    		if (num[i] != num[size]) {
    			num[++size] = num[i];
    		}
    	}
    	return size + 1;
    }
    
    public static int removeDuplicates3(int[] num){
    	if (num == null || num.length == 0) {
    		return 0;
    	}
    	int size = 0;
    	boolean flag = true;
    	for (int i = 0; i < num.length; i++) {
    		if (num[i] != num[size]) {
    			num[++size] = num[i];
    			flag = true;
    		} else {
    			if (flag){
    				if ((i - size) == 1) {
    					size++;
    					flag = false;
    				}
    			}
    		}
    	}
    	return size + 1;
    }
    
    public static int removeElements(int[] num, int element){
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for (int i = 0; i < num.length; i++) {
    		if (num[i] != element) {
    			list.add(new Integer(num[i]));    			
    		}
    	}
    	int i = 0;
    	Iterator<Integer> iter = list.iterator();
    	while (iter.hasNext()) {
    		Integer n = iter.next();
    		num[i++] = n;
    	}
    	return list.size();
    }

    public static int searchInsert(int[] num, int target){
    	int len = num.length;
    	int b = 0;
    	int e = len - 1;
    	int mid;
    	while (b <= e) {
    		mid = (e + b) / 2;
    		if (num[mid] > target) {
    			e = mid - 1;
    		} else if (num[mid] < target) {
    			b = mid + 1;
    		} else {
    			return mid;
    		}
    	} 	
    	return b;  	
    }
    
    public static void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
    	
    	for (int index = 0; index < nums.size() - 1; index++) {
    		if (nums.get(index) > nums.get(index + 1)) {
    			reverse(nums, 0, index);
    			reverse(nums, index + 1, nums.size() - 1);
    			reverse(nums, 0, nums.size() - 1);
    			return;
    		}
    		
    	}
    }
    public static void reverse(ArrayList<Integer> nums, int begin, int end){
    	for (int i = begin, j = end; i < j; i++, j--) {
    		int tmp = nums.get(i);
    		nums.set(i, nums.get(j));
    		nums.set(j, tmp);
    	}
    }
    
    
}
