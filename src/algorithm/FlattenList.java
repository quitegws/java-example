package algorithm;

import java.util.ArrayList;
import java.util.List;

public class FlattenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
    	List<Integer> list = new ArrayList<Integer>();
    	List<Integer> tmp = new ArrayList<Integer>();
    	
    	for (NestedInteger i : nestedList) {
    		if (i.isInteger()) {
    			list.add(i.getInteger());
    		} else {
    			tmp = flatten(i.getList());
    			for (Integer j : tmp) {
    				list.add(j);
    			}
    		}
    	}
        return list;
    }
}
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer,
 *     // rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds,
 *     // if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds,
 *     // if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

interface NestedInteger{
	public boolean isInteger();
	public Integer getInteger();
	public List<NestedInteger> getList();
	
}