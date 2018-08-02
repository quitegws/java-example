package index;

public class _35 {


    public int searchInsert(int[] A, int target) {
        int len = A.length;
        if (len == 0) {
            return 0;
        } else {
            for (int i = 0; i < len; i++) {
                if (A[0] > target) {
                    return 0;
                } else if (A[len - 1] < target) {
                    return len;
                } else if (A[i] == target) {
                    return i;
                } else if (A[i] < target && A[i + 1] > target) {
                    return i + 1;
                }
            }
            return len;
        }
    }



}
