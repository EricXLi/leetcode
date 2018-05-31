package lc.LC374.GuessNumberHigherOrLower;

public class RunnerClass {

	public static void run() {
		int solutionNumber = 0;
		int targetRange = 20000;
		long startTime;
		long endTime;
		int result;
		switch(solutionNumber) {
		case 1:
			Solution solution = new Solution();
			startTime = System.nanoTime();
			result = solution.guessNumber(targetRange);
			endTime = System.nanoTime();
			System.out.println("Guessed Result: " + result);
			System.out.print("Time took: "+ (endTime-startTime));
			break;
		case 2:
			SolutionNonRecur sol = new SolutionNonRecur();
			startTime = System.nanoTime();
			result = sol.guessNumber(targetRange);
			endTime = System.nanoTime();
			System.out.println("Guessed Result: " + result);
			System.out.print("Time took: "+ (endTime-startTime));
			break;
		case 3:
			SolutionBinarySearchNonRecur  sbsnr = new SolutionBinarySearchNonRecur();
			startTime = System.nanoTime();
			result = sbsnr.guessNumber(targetRange);
			endTime = System.nanoTime();
			System.out.println("Guessed Result: " + result);
			System.out.print("Time took: "+ (endTime-startTime));
		}
		
		Solution solution = new Solution();
		startTime = System.nanoTime();
		result = solution.guessNumber(targetRange);
		endTime = System.nanoTime();
		System.out.println("Guessed Result: " + result);
		System.out.print("Time took: "+ (endTime-startTime));
		SolutionNonRecur sol = new SolutionNonRecur();
		startTime = System.nanoTime();
		result = sol.guessNumber(targetRange);
		endTime = System.nanoTime();
		System.out.println("Guessed Result: " + result);
		System.out.print("Time took: "+ (endTime-startTime));

		SolutionBinarySearchNonRecur  sbsnr = new SolutionBinarySearchNonRecur();
		startTime = System.nanoTime();
		result = sbsnr.guessNumber(targetRange);
		endTime = System.nanoTime();
		System.out.println("Guessed Result: " + result);
		System.out.print("Time took: "+ (endTime-startTime));
	}
}
