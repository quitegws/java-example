package algorithm;

import java.lang.reflect.Array;

public class PrintUtils {

	public static void printArray(int[] a, String name){
		int len = a.length;
		if (len == 0){
			System.out.println("[]");
			return;
		}
		System.out.print(name + " is : [");
		for (int i = 0; i < len - 1; i++){
			System.out.print(a[i] + ", ");
		}
		System.out.print(a[len - 1] + "]");
		System.out.println();
	}
}
