package index;

/**
 * @Author: gws
 * @Date: 25/09/2018 14:10
 * @Description:
 */
public class _42 {
    public static void main(String[] args) {

        int[] a = new int[]{5,2,1,2,1,5};

        System.out.println(trap(a));
    }
    public static int trap(int[] height) {
        int len = height.length;
        int volumn = 0;
        int lastPeek = -1;
        int[] h = height;

        for(int i = 0; i < len; i++){

            if((i == 0 && len >= 2 && h[i] > h[i + 1]) || (i == len - 1 && len > 2 && h[i] > h[i - 1]) ||(i > 0 && i < height.length - 1 && h[i - 1] < h[i] && h[i] > h[i + 1])){
                if(lastPeek != -1){
                    int v = 0;
                    int min = Math.min(h[i] , h[lastPeek]);
                    for(int j = lastPeek + 1; j <= i - 1; j++){
                        v += h[j] > min ? 0 : (min - h[j]);
                    }
                    volumn += v;
                    lastPeek = i;
                } else {
                    lastPeek = i;
                }
            }
        }
        return volumn;
    }
}
