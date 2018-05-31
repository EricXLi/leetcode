package lc.LC495.TeemoAttacking;


public class RunnerClass {

	public static void run() {
		int[] attack = {1,4};
		int duration = 2;
		
		Solution s = new Solution();
		int totalTime = s.findPoisonedDuration(attack, duration);
		System.out.println(totalTime);
			
	}
}
