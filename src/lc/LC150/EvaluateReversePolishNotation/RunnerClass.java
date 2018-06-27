package lc.LC150.EvaluateReversePolishNotation;

public class RunnerClass {

	public static void run() {
		String[] rpn = {"2","1","+","3","*"};
		
		Solution s = new Solution();
		int result =  s.evalRPN(rpn);
		System.out.println(result);
		
	}
}
