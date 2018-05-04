package array;

import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ThreeSum().threeSum2(new int[]{-1, 0, 1, 2, -1, -4}));
	}
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if(nums == null || nums.length<3)
			return result;

		Arrays.sort(nums);

		for(int i=0; i<nums.length-2; i++){
			if(i==0 || nums[i] > nums[i-1]){
				int j=i+1;
				int k=nums.length-1;

				while(j<k){
					if(nums[i]+nums[j]+nums[k]==0){
						List<Integer> l = new ArrayList<Integer>();
						l.add(nums[i]);
						l.add(nums[j]);
						l.add(nums[k]);
						result.add(l);

						j++;
						k--;

						//handle duplicate here
						while(j<k && nums[j]==nums[j-1])
							j++;
						while(j<k && nums[k]==nums[k+1])
							k--;

					}else if(nums[i]+nums[j]+nums[k]<0){
						j++;
					}else{
						k--;
					}
				}
			}

		}

		return result;
	}

	public List<List<Integer>> threeSum2(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int length = nums.length;
		if(length<3){
			return result;
		}
		Arrays.sort(nums);

		int i = 0;
		while(i<length-2){
			if(nums[i]>0) break;
			int j = i+1;
			int k = nums.length - 1;
			while(j<k){
				int sums = nums[i] + nums[j] + nums[k];
				if (sums==0){
					result.add(Arrays.asList(nums[i], nums[j], nums[k]));
				}
				if (sums<=0){
					//消去左侧重复的数字
					while(nums[j]==nums[++j] && j < k);
				}
				if (sums>=0){
					//消去右侧重复的数字
					while(nums[k--] == nums[k] && j < k);
				}
			}
			//消去和当前左指针相同的数字
			while(nums[i] == nums[++i] && i < nums.length - 2);
		}
		return result;
	}

    
}
