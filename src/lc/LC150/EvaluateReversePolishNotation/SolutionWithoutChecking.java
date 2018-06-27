package lc.LC150.EvaluateReversePolishNotation;

import java.util.Stack;

public class SolutionWithoutChecking {
	private Stack<Integer> stack = new Stack<>();
    public int evalRPN(String[] tokens) {
        for(String s : tokens){
        	Integer result = null;
        	switch(s) {
        		case "+" : 
        			result = stack.pop() + stack.pop(); 
        			break;
        		case "-" :
        			result = -1 * (stack.pop() - stack.pop());
        			break;
        		case "*" : 
        			result = stack.pop() * stack.pop();
        			break;
        		case "/" :
        			int b = stack.pop();
        			int a = stack.pop();
        			result = a / b; 
        			break;
        		default : 
        			result = Integer.parseInt(s);
        	}
        	stack.push(result);
		}		
		return stack.pop();
    }

	

}
