package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if (newInterval == null || intervals == null){
        	return intervals;
        }
        ArrayList<Interval> result = new ArrayList<Interval>();
        int insertPos = 0;
        for (Interval interval : intervals){
        	if (interval.end < newInterval.start){
        		result.add(interval);
        		insertPos++;
        	} else if (interval.start > newInterval.end){
        		result.add(interval);
        	} else {
        		newInterval.start = Math.min(interval.start, newInterval.start);
        		newInterval.end = Math.max(interval.end, newInterval.end);
        	}
        }
        
        result.add(insertPos, newInterval);
        
        // write your code here
        return result;
    }

    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
    	ArrayList<Interval> list = new ArrayList<Interval>();
    	
    	for (Interval interval : intervals){
    		list = insert(list, interval);
    	}

    	return list;
    }
	//defination of interval
	public class Interval{
		int start; 
		int end; 
		public Interval(int start, int end){
			this.start = start; 
			this.end = end;
		}
	}
}
