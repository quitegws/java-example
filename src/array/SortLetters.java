package array;

import java.util.Arrays;

public class SortLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'a');
		char[] c = "aDDDdddFFEEGEGEGsfsdafdsfSWgGKkKjhhnBBNNJJJjjhioqobcAD".toCharArray();
		sortLetters(c);
		for (char cc : c) {
			System.out.println(cc);
		}
	}
	public static void sortLetters(char[] chars){
		int len = chars.length;
		int j = len - 1;
		int i = 0;
		while (i < j) {
			char c = chars[i];
			if (c >= 'A' && c <= 'Z') {
				char tmp = chars[j];
				chars[j] = c;
				chars[i] = tmp;
				j--;
				continue;
			} else {
				i++;
			}
		}
	}
}
