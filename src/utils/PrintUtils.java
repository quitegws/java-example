package utils;

import java.lang.reflect.Array;
import java.util.List;

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
	
	public static <T> void printList(List<T> list){
		int len = list.size();
		if (len == 0) {
			System.out.println("List length is 0");
			return;
		}
		System.out.print("[");
		for (int i = 0;i < len - 1; i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println(list.get(len - 1) + "]");
	}
}
