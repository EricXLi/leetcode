package lc.LC078.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a set of distinct integers, nums, return all possible subsets (the power set).
// No duplicate allowed

class Solution {
	private int[] nums;
	private List<List<Integer>> list  = new ArrayList<>();;
	public List<List<Integer>> subsets(int[] nums) {
		this.nums = nums;
	    //Arrays.sort(nums);
	    backtrack2(0, new ArrayList<>());
	    return list;
	}

	private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
		//System.out.println("First" + "Start: "+ start +  "	TempList: " + Arrays.toString(tempList.toArray()));
	    list.add(new ArrayList<>(tempList));
	    for(int i = start; i < nums.length; i++){
	        tempList.add(nums[i]);
			System.out.println("First " + "I:	"+ i +  "	Start: "+ start +  "	TempList: " + Arrays.toString(tempList.toArray()));
	        backtrack(list, tempList, nums, i + 1);
	        tempList.remove(tempList.size() - 1);
			System.out.println("Second " + "I:	"+ i +  "	Start: "+ start +  "	TempList: " + Arrays.toString(tempList.toArray()));
	    }
	}
	
	private void backtrack2(int start, List<Integer> tempList) {
		System.out.println("First" + "Start: "+ start +  "	TempList: " + Arrays.toString(tempList.toArray()));
		//Ok, I'm passing the reference of tempList into add(), everytime tempList change, the entire list chages, need to create a new List before add
		//list.add(tempList);
		list.add(new ArrayList<>(tempList));
		//System.out.println("List: " + Arrays.toString(list.toArray()));
		for(int i = start ; i < nums.length ; i++) {
			tempList.add(nums[i]);
			//you have to use i + 1 instead of ++i since you don't want the value of i to be changed
			backtrack2(i + 1, tempList);
			tempList.remove(tempList.size() - 1);
		}
	
		
	}

}