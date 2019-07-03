package lc.LC423.reconstructOriginalDigitsfromEnglish;


public class RunnerClass {

	public static void run() {
		String input = "owoztneoer";
		String expectedOutput = "012";
		
		Solution s = new Solution();
		String output = s.originalDigits(input);
		System.out.println(output);
		System.out.println(output.equals(expectedOutput));
	}
}
