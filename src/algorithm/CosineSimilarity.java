package algorithm;

public class CosineSimilarity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cosineSimilarity(new int[]{1000,2000,3000}, new int[]{2000,3000,4000}));
	}

    public static double cosineSimilarity(int[] A, int[] B) {
        // write your code here
    	if (A.length != B.length) {
    		return 2.0;
    	}
    	double similarity = 0.0;
    	int ab = 0;
    	int aa = 0;
    	int bb = 0;
    	
    	for (int i = 0; i < A.length; i++) {
    		ab += A[i] * B[i];
    		aa += A[i] * A[i];
    		bb += B[i] * B[i];
    	}
    	if (aa == 0 || bb == 0) {
    		return 2.0;
    	}
    	
    	similarity = ab / (Math.sqrt(aa) * Math.sqrt(bb));
    	return similarity;
    }
}
