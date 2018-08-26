package string;

public class Solution {
    //Insert one char from stringstream
    private int[] occurence = new int[256];
    private int index;

    public Solution(){
        for(int i=0;i<256;i++){
            occurence[i] = -1;
        }
        index = 0;
    }
    void Insert(char ch)
    {
        if(occurence[ch] == -1)
            occurence[ch] = index;
        else if(occurence[ch] >= 0)
            occurence[ch] = -2;

        index++;
    }
    //return the first appearence once char in current stringstream
    char FirstAppearingOnce()
    {
        char ch = '\0';
        int minIndex = Integer.MAX_VALUE;
        for(int i=0;i<256;i++){
            if(occurence[i] >=0 && occurence[i]<minIndex){
                ch = (char)i;
                minIndex = occurence[i];
            }
        }
        if(ch == '\0')
            return '#';
        return ch;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i = 0; i < 1000; i++) {
            s.Insert((char)(i % 256));
        }
        s.Insert(' ');
    }
}