package algorithm;

import java.util.ArrayList;

public class InsertInterval {
    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
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
}

//defination of interval
class Interval{
	int start; 
	int end; 
	public Interval(int start, int end){
		this.start = start; 
		this.end = end;
	}
}
