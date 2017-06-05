package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SingleNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SingleNumber3().singleNumberIII(new int[]{1,2,3,3,2,4,1,5}));
	}

    public List<Integer> singleNumberIII(int[] A) {
        // Write your code here
 	   ArrayList<Integer> list = new ArrayList<>();
 	   
 	   int len = A.length;
 	   
 	   for (int i = 0; i < len; i++) {
 		   if (list.contains(A[i])) {
 			  list.remove(new Integer(A[i]));
 		   } else {
 			  list.add(A[i]);
 		   }
 	   }
 	   return list;
    }
}
