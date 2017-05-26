package array;

import java.util.HashSet;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,1,3,4,3};
		System.out.println(singleNumber(a));
	}
    /**
     *@param A : an integer array
     *return : a integer 
     */
   public static int singleNumber(int[] A) {
       // Write your code here
	   HashSet<Integer> set = new HashSet<>();
	   int len = A.length;
	   if (len == 1) {
		   return A[0];
	   }
	   for (int i = 0; i < len; i++) {
		   if (set.contains(A[i])) {
			   set.remove(A[i]);
		   } else {
			   set.add(A[i]);
		   }
	   }
	   
	   if (set.size() == 1) {
		   return set.iterator().next();
	   }
	   return -1;
   }
}
