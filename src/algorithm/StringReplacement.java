package algorithm;

public class StringReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('-' > 'a');
		System.out.println(stringPermutation("asfhjhsajfhjahsfueuhuqpasjfnmxznbdsafueqhuuuhuhuihu7y8u87890-0---kjsafkjaskjfsalkfnmzxncmncfafuenfjasnfjkanhds","afkjaskhjaafuehfasfhjhsajfhuh-kjsjasnfjkanhdshsfuihu7y8u87890-0-fueqhuuujfqpalkfnmz-ueuhufnmsjsaxznbdsaxncmncf") + "");
	}

    public static boolean stringPermutation(String A, String B) {
        // Write your code here
        int lenA = A.length();
        int lenB = B.length();
        
        if (lenA != lenB ){
            return false;
        }
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        
        sort(a);print(a);
        sort(b);print(b);
        
        for (int i = 0; i < lenA; i++){
        	if (a[i] != b[i]){
        		return false;
        	}
        }
        return true;
    }
    
    public static void sort(char[] a){
    	int len = a.length;
        for (int i = 0; i < len; i++){
        	for (int j = 0; j < len - 1 - i; j++){
        		if (a[j + 1] < a[j]){
        			char tmp = a[j];
        			a[j] = a[j + 1];
        			a[j + 1] = tmp;
        		}
        	}
        }
    }
    
    public static void print(char[] a){
    	for (int i = 0; i < a.length; i++){
    		System.out.print(a[i] + ", ");
    	}
    	System.out.println();
    }
}
