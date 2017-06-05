package array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findDuplicate(new int[]{1,2,3,4,5,6,7,7,8,9}));
	}

	public static int findDuplicate2(int[] A){
		
		int len = A.length;
		
		for (int i = 1; i <= len - 1; i++) {
			int cnt = 0;
			for (int j = 0; j < len; j++) {
				if (A[j] == i) {
					cnt++;
				}
			}
			if (cnt >= 2) {
				return i;
			}
		}
		return 0;
	}
	
	public static int findDuplicate(int[] A){
		
		int len = A.length;
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < len; i++) {
			if (set.contains(A[i])) {
				return A[i];
			} else {
				set.add(A[i]);
			}
		}
		return 0;
	}
	
}
