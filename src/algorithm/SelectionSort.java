package algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,9,5,4,7,6,11,2,2,2,3,4};
		sort(a);
		utils.PrintUtils.printArray(a, "a");
	}

	public static void sort(int[] a){
		if (a == null || a.length == 0) {
			return;
		}
		
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int max = a[len - 1 - i];
			int currentMaxIndex = len - 1 - i;
			for (int j = 0; j < len - 1 - i; j++) {
				if (a[j] > max) {
					currentMaxIndex = j;
					max = a[j];
				}
			}
			if (len - 1 - i != currentMaxIndex) {
				int tmp = a[len - 1 - i];
				a[len - 1 - i] = a[currentMaxIndex];
				a[currentMaxIndex] = tmp;
				
			}
		}
	}
}
