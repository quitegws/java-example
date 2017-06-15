package utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
	
	public static  ArrayList<Integer> toList (int[] a) {
		if (a == null) {
			return null;
		}
		int size = a.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < size; i++) {
			list.add(a[i]);
		}
		
		return list;
	}
	
	public static  int[] toArray (List<Integer> list) {
		if (list == null) {
			return null;
		}
		int size = list.size();
		
		int[] a = new int[size];
		
		for (int i = 0; i < size; i++) {
			a[i] = list.get(i);
		}
		
		return a;
	}
	
}
