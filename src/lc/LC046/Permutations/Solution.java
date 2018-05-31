package lc.LC046.Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a set of distinct integers, nums, return all possible subsets (the power set).
// No duplicate allowed

class Solution {
	private int[] nums;
	private List<List<Integer>> list  = new ArrayList<>();
	public List<List<Integer>> permute(int[] nums) {
		this.nums = nums;
	    //Arrays.sort(nums);
		permute(new ArrayList<>());
	    return list;
	}
	
	
	private void permute(ArrayList<Integer> tempList) {
		for(int i = 0 ; i < nums.length ; i++) {
			if(tempList.contains(nums[i])) continue;
			tempList.add(nums[i]);
			permute(tempList);
			if(tempList.size() == nums.length) {
				list.add(new ArrayList(tempList));
			}
			tempList.remove(tempList.size()-1);
		}
	}

}