package array;

public class CanJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CanJump().canJump(new int[]{1,0}));
	}
    public boolean canJump(int[] A) {
        // wirte your code here
    	if (A == null || A.length == 0) {
    		return false;
    	}
    	int len = A.length;
    	int far = A[0];
    	
    	for (int i = 0; i < len; i++) {
    		if (i <= far && (A[i] + i) > far) {
    			far = A[i] + i;
    		}
    	}
    	
    	return far >= len - 1;
    }
}
