package string;

public class Kata {

  public static String encrypt(final String text, final int n) {
    // Your code here
    if (text == null || text.equals("") || n <= 0) {
      return text;
    }
    String result = text;
    for (int j = 1; j <= n; j++) {
      StringBuilder sb = new StringBuilder();
      int len = result.length();
      int i = 0;
      while (((2 * i) + 1) < len) {
        sb.append(result.charAt((2 * i) + 1));
        i++;
      }
      i = 0;
      while (2 * i < len) {
        sb.append(result.charAt(2 * i));
        i++;
      }
      result = sb.toString();
    
    }
    return result;   
  }
  
  public static String decrypt(final String encryptedText, final int n) {
    // Your code here
    if (encryptedText == null || encryptedText.equals("") || n <= 0) {
      return encryptedText;
    }
    String result = encryptedText;
    int len = result.length();
    for (int j = 1; j <= n; j++) {
    StringBuilder sb = new StringBuilder();
      int mid = (len) / 2;
      int i = 0;
      for (; i < mid + 1; i++) {
    	if ((mid + i) < len) {
    		sb.append(result.charAt(mid + i));
    	}
    	if (i < mid) {
    		sb.append(result.charAt(i));
    		
    	}
      }
      result = sb.toString();
    }
    return result;
  }
  
  public static void main(String[] args){
	  String text = "This is a file.test[!]";
	  int cnt = 1;
	  String entext = encrypt(text,cnt);
	  
	  System.out.println("original text is : " + text + "   after encrypt : " + entext);
	  System.out.println("after decrypt : " + decrypt(entext, cnt));
	  
  }
}