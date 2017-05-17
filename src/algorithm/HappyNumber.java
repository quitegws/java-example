package algorithm;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isHappy(int num){
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(num != 1){
			if(set.contains(num)){
				return false;
			}
			set.add(num);
			num = getNext(num);
		}
		
		return true;
	}
	
	public static int getNext(int happy){
		int sum = 0;
		while(happy != 0){
			sum += (happy % 10) * (happy % 10);
			happy /= 10;
		}
		
		return sum;
	}

}
