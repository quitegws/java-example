package stack;


  import java.util.ArrayList;

// This is the interface that allows for creating nested lists.
 // You should not implement it, or spec ulate about its implementation


import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {
	
	private Iterator<NestedInteger> iterator;
    public NestedIterator(List<NestedInteger> nestedList) {
        // Initialize your data structure here.
    	nestedList = flatten(nestedList);
    	iterator = nestedList.iterator();
    }
    public List<NestedInteger> flatten(List<NestedInteger> list){
    	List<NestedInteger> output = new ArrayList<NestedInteger>();
    	List<NestedInteger> tmp = new ArrayList<NestedInteger>();
    	Iterator i = list.iterator();
    	NestedInteger ni ;
    	while (i.hasNext()) {
    		ni = (NestedInteger) i.next();
    		if (ni.isInteger()) {
    			output.add(ni);
    		} else {
    			tmp = flatten(ni.getList());
    			for (NestedInteger nestedInteger : tmp) {
    				output.add(nestedInteger);
    			}
    		}
    	}
    	return output;
    }
    // @return {int} the next element in the iteration
    @Override
    public Integer next() {
        // Write your code here
    	NestedInteger next = iterator.next();
    	return next.getInteger();
    }

    // @return {boolean} true if the iteration has more element or false
    @Override
    public boolean hasNext() {
        // Write your code here
    	return iterator.hasNext();
    }

    @Override
    public void remove() {}
}

interface NestedInteger {
	 
    // @return true if this NestedInteger holds a single integer,
    // rather than a nested list.
    public boolean isInteger();

   // @return the single integer that this NestedInteger holds,
    // if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds,
    // if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v.add(i.next());
 */