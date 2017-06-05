package array;

import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,2,3,3,3,2,2,4,1};
		System.out.println(singleNumberII(a));
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
	/**
	 * @param A : An integer array
	 * @return : An integer 
	 */
   public static int singleNumberII(int[] A) {
       // write your code here
	   HashMap<Integer, Integer> map = new HashMap<>();
	   if (A == null || A.length == 0) {
		   return 0;
	   }
	   int len = A.length;
	   for (int i = 0; i < len; i++) {
		   if (map.containsKey(A[i]) && map.get(A[i]) == 2) {
			   map.remove(A[i]);
			   continue;
		   } else if (map.containsKey(A[i]) && map.get(A[i]) == 1) {
			   map.put(A[i], 2);
			   continue;
		   } else {
			   map.put(A[i], 1);
		   }
	   }
	   
	   if (map.size() == 1) {
		   return map.entrySet().iterator().next().getKey();
	   }
	   return -1;
	   
   }
}
