package array;

public class PartitionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{7,7,9,8,6,6,8,7,9,8,6,6};
		System.out.println(new PartitionArray().partitionArray(a, 10));
	}
	/** 
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
	    //write your code here
    	if (nums == null || nums.length == 0) {
    		return 0;
    	}
    	int len = nums.length;
    	int splitIndex = len;
    	
    	int i = 0;
    	while (i <= splitIndex - 1) {
    		if (nums[i] >= k) {
    			swap(i, splitIndex - 1, nums);
    			splitIndex--;
    			continue;
    		}
    		i++;
    	}
    	
    	return splitIndex;
    	
    }
    
    
    public void swap(int left, int right, int[] colors) {
        int tmp = colors[left];
        colors[left] = colors[right];
        colors[right] = tmp;
    }
    
}
