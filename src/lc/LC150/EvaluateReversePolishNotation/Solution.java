package lc.LC150.EvaluateReversePolishNotation;

import java.util.Stack;

//Use stack to hold the numbers
//go through the array, if it is number, push in, 
//else, pop out two numbers and do the operation.
//The second one poped up will be the first in the operation
// After get the result, push the number back on the stack, mimicking parentheses
class Solution {
	private Stack<Integer> stack = new Stack<>();
    public int evalRPN(String[] tokens) {
        for(String s : tokens){
        	//System.out.println(s);
			if(isNumber(s)){
			   stack.push(Integer.parseInt(s));
			} else {
			    Integer result = operate(stack.pop(), stack.pop(), s);
				stack.push(result);
			}
		}
		
		return stack.pop();
    }
	
	private boolean isNumber(String s){
		String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
		for(String digit : digits){
			if(s.contains(digit)){
				return true;
			}
		}
		return false;
	}
	
	private Integer operate(Integer b, Integer a, String operation){
		Integer result = null;
		switch(operation) {
			case "+" : result = a + b; break;
			case "-" : result = a - b; break;
			case "*" : result = a * b; break;
			case "/" : result = a / b; break;
			default : break;
		}
		return result;
	}
	
}
