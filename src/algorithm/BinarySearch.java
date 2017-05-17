package algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int binarySearch(int[] nums, int target){

		if (nums.length == 0 ){
			return -1;
		}
		
		int low = 0;
		int high = nums.length - 1;
		
		while (low < high){
			int middle = low + (high - low) / 2;
			if (nums[middle] == target){
				high = middle;
			} else if (nums[middle] > target){
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		
		if (nums[high] == target){
			return high;
		}
		return -1;
	}
}
