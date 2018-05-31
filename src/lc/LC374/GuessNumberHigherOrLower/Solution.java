package lc.LC374.GuessNumberHigherOrLower;
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return guessRange(1, n);
    }
    
    //recursive solution, stack overflow for big numbers
    private int guessRange(int start, int end) {
    	//int mid = (int) Math.floor((start + end)/2);
    	//No need to cast to mid since int cast will do a floor automatically
    	 //System.out.println(start + "  " + end);
    	//Always going down is not right, for 2,2 test case, it will stuck at 1,2
    	//int mid = (int) ((start + end)/2);
    	int mid = start + (end - start)/2;
    	int result = guess(mid);
    	if(result > 0) {
    		return guessRange(mid + 1, end);
    	} else if(result < 0) {
    		return guessRange(start, mid);
    	} else {
    		return mid;
    	}
    }
    
    
}