package array;

public class RemoveDulplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-14,-14,-14,-14,-14,-14,-14,-13,-13,-13,-13,-12,-11,-11,-11,-9,-9,-9,-7,-7,-7,-6,-6,-5,-5,-5,-4,-4,-4,-3,-3,-3,-2,-2,-2,-1,-1,0,0,0,0,1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,5,5,6,6,6,7,7,7,7,8,8,8,8,9,9,10,10,11,11,11,11,11,12,12,12,12,13,13,13,13,14,14,15,16,17,18,18,18,20,20,21,21,21,21,21,22,22,22,22,23,24,24,25};
		System.out.println(removeDuplicates(a));
		utils.PrintUtils.printArray(a, "a");
	}
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public static int removeDuplicates(int[] num){
	    	if (num == null || num.length == 0) {
	    		return 0;
	    	}
	    	int len = num.length;
	    	if (len <= 2) {
	    		return len;
	    	}
	    	int size = 0;
	    	boolean flag = true;
	    	
	    	for (int i = 1; i < len; i++) {
	    		int cur = num[i];
	    		if (cur == num[i - 1]) {
	    			if (flag) {
	    				flag = false;
	    				num[++size] = cur;
	    			} else {
	    				continue;
	    			} 
	    		} else {
	    			num[++size] = cur;
	    			flag = true;
	    		}
	    	}
	    	return size + 1;
    }

}
