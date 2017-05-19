package algorithm;

/* The guess API is defined in the parent class GuessGame.
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
   int guess(int num); */

public class GuessNumberGame extends GuessGame {
	public GuessNumberGame(int range, int val) {
		super(range, val);
			// TODO Auto-generated constructor stub
	}

/**
  * @param n an integer
  * @return the number you guess
  */
	 public static int guessNumber(int n) {
	     // Write your code here
		 long left = 1;
		 long right = n;
		 
		 while (left < right) {
			 long mid = (left + right) / 2;
//			 System.out.println("left : " + left + ", right: " + right + ", mid: " + mid);
			 if (guess((int)mid) == 0) {
				 return (int)mid;
			 } else if (guess((int)mid) == -1) {
				 right = mid - 1;
				 continue;
			 } else {
				 left = mid + 1;
			 }
		 }
		 return (int)left;
	 }
	 public static void main(String...args){
		 int n = 2147483647;
		 GuessNumberGame gng = new GuessNumberGame(n, n);
		 System.out.println("the number i guess is : " + guessNumber(n));
	 }
}



class GuessGame{
	static int range;
	static int val;
	public GuessGame(int r, int v){
		if (r <= 1) {
			range = 1;
			val = 1;
			System.out.println("val in GuessGame is " + val);
		} else {
			range = r;
			val = v;
			System.out.println("val in GuessGame is " + val);
		}
	}
	public static int guess(int num){
		if (val > num) {
			return 1;
		} else if (val < num) {
			return -1;
		} else {
			return 0;
		}
	}
}