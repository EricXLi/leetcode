package lc.LC046.Permutations;

import java.util.Arrays;
import java.util.List;

public class RunnerClass {

	public static void run() {
		int[] nums = {1,2,3};
		
		Solution s = new Solution();
		List<List<Integer>> list =  s.permute(nums);
		for(List<Integer> item : list) {
			System.out.println(Arrays.toString(item.toArray()));
		}
		
	}
}
