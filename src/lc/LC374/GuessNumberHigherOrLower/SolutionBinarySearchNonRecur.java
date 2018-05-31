package lc.LC374.GuessNumberHigherOrLower;
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class SolutionBinarySearchNonRecur extends GuessGame {
    public int guessNumber(int n) {
    	int start = 1;
    	int end = n;
    	int mid = -1;
    	while(start <= end) {
    		//System.out.println(start + "   " + end);
        	mid = start + (end - start)/2;
        	int result = guess(mid);
        	if(result == 0) {
        		return mid;
        	} else if(result < 0) {
        		end = mid;
        	} else {
        		start = mid + 1;
        		
        	}
    	}
    	//need to return start instead of mid
    	//return mid;
    	return mid;
    	
    }
    
}