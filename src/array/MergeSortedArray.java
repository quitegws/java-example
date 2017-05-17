package array;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{416,484,808,960,1340,1342,1618,1632,1841,1898,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] B = new int[]{31,85,102,194,282,371,396,453,707,771,1619,1876};
		int[] a = new int[]{1,2,3,0,0};
		int[] b = new int[]{4,5};
		a = mergeSortedArray(A,10,B,12);
		utils.PrintUtils.printArray(a, "c");
	}
    public static int[] mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
    	int[] c = new int[m + n];
    	int i = 0; 
    	int j = 0;
    	int l = 0;
    	while (i < m && j < n) {
    		if (A[i] < B[j]) {
    			c[l] = A[i];
    			i++;
    			l++;
    		}else {
    			c[l] = B[j];
    			j++;
    			l++;
    		}
    	}
    	if (i >= m) {
    		for (int k = j; k < n; k++) {
    			c[l] = B[k];
    			l++;
    		}
    	}
    	if (j >= n) {
    		for (int k = i; k < m; k++) {
    			c[l] = A[k];
    			l++;
    		}
    	}
    	return c;
    }

    public static void mergeSortedArray2(int[] a, int m, int[] b, int n){
    	int i = m - 1;
    	int j = n - 1;
    	int index = m + n - 1;
    	
    	while (i >= 0 && j >= 0) {
    		if (a[i] > b[j]) {
    			a[index--] = a[i--];
    		} else {
    			a[index--] = b[j--];
    		}
    	}
    	while (i >= 0) {
    		a[index--] = a[i--];
    	}
    	while (j >= 0) {
    		a[index--] = b[j--];
    	}
    }
    
}
