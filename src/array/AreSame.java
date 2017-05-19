package array;

import java.util.ArrayList;
import java.util.Arrays;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null) {
			return false;
		}
		if (a.length == 0 && b.length == 0) {
			return true;
		}
		int alen = a.length;
		int blen = b.length;
		if (alen != blen) {
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		ArrayList<Integer> alist = new ArrayList<>();
		ArrayList<Integer> blist = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			alist.add(a[i]);
			blist.add(b[i]);
		}
		if (a[a.length - 1] >= b[b.length - 1]) {
			for (int i = 0; i < b.length; i++) {
				if (alist.contains(b[i] * b[i])) {
					alist.remove(new Integer(b[i] * b[i]));
				} else {
					return false;
				}
			}
		} else {
			for (int i = 0; i < a.length; i++) {
				if (blist.contains(a[i] * a[i])) {
					blist.remove(new Integer(a[i] * a[i]));
				} else {
					return false;
				}
			}
		}
		
		return true;
  }
	public static void main(String[] args){
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		System.out.println(comp(a, b));
	}
}