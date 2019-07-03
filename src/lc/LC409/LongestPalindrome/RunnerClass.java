package lc.LC409.LongestPalindrome;


public class RunnerClass {

	public static void run() {
		String input = "abccccddzzAA";
		int expectedOutput = 11;
		
		Solution s = new Solution();
		int output = s.longestPalindrome(input);
		System.out.println(output);
		System.out.println(output == expectedOutput);
	}
}
