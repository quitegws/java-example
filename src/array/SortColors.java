package array;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,1,2,2,1,1,2,0,0,0};
		sortColors4(a);
		System.out.println();
		utils.PrintUtils.printArray(a, "a");
	}
	
	public static void sortColors (int[] A) {
		if (A == null || A.length == 0) {
			return;
		}
		
		int len = A.length;
		int cnt0 = 0;
		int cnt1 = 0;
		for (int i = 0; i < len; i++) {
			if (A[i]== 0) {
				cnt0++;
			} else if (A[i] == 1) {
				cnt1++;
			}
		}
		for (int i = 0; i < len; i++) {
			if (cnt0-- > 0) {
				A[i] = 0;
				continue;
			} else if (cnt1-- > 0) {
				A[i] = 1;
				continue;
			} else {
				A[i] = 2;
			}
		}
	}
	
	public static void sortColors2 (int[] A) {
		if (A == null || A.length == 0) {
			return;
		}
		
		int len = A.length;
		int i, j, l, r;
		i = l = 0;
		j = r = len - 1;
		
		while (i <= j) {
			if (A[i] == 0) {
				swap(A, i, l);
				l++;
				i++;
				continue;
			}
			if (A[j] == 2) {
				swap(A, j, r);
				r--;
				j--;
				continue;
			}
			if (A[i] == 2) {
				swap(A, i, j);
				continue;
			}
			if (A[j] == 0) {
				swap(A, j, i);
				continue;
			}
			i++;
			j--;
		}
	}
	
    public static void sortColors3(int[] A) {  
        int len = A.length;  
        int i, j, r, w, b;  
        i = 0;  
        j = len - 1;  
        r = b = 0;  
        while (i <= j) {  
            if (A[i] == 0) {  
                swap(A, i, r);  
                i++;  
                r++;  
                continue;  
            }  
            if (A[j] == 2) {  
                swap(A, j, len-1-b);  
                j--;  
                b++;  
                continue;  
            }  
            if (A[j] == 0) {  
                swap(A, i, j);  
                continue;  
            }  
            if (A[i] == 2) {  
                swap(A, i, j);  
                continue;  
            }  
            //如果上述任何情况都不满足，那么只有下面一种可能  
            //if (A[i] == 1 && A[j] == 1) {  
                i++;  
                j--;  
            //}  
        }  
    }
	
	public static void swap (int[] A, int i, int j) {
		if (A == null || i < 0 || j < 0) {
			return;
		}
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	public static void sortColors4 (int[] A) {
		if (A == null || A.length == 0) {
			return;
		}
		
		int i = 0;
		int j = A.length - 1;
		int l = 0;
		
		while (i <= j) {
			if (A[i] == 0) {
				swap(A, i, l);
				i++;
				l++;
			} else if (A[i] == 1) {
				i++;
			} else {
				swap(A, i, j);
				j--;
			}
		}
	}
	
	
}
