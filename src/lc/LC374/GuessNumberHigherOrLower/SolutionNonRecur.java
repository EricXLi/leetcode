package lc.LC374.GuessNumberHigherOrLower;
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class SolutionNonRecur extends GuessGame {
	private boolean found =false;
	private int start;
	private int end;
	private int result = -1;

	public int guessNumber(int n) {
		this.start = 1;
		this.end = n;
		
    	while(!found) {
    		result = guessRangeNonRecursive();
    	}
    	return result;        
    }

	private int guessRangeNonRecursive() {
    	int mid = start + (end - start)/2;
    	int temp = guess(mid);
    	if(temp > 0) {
    		//Need to increace start, eg, 2,2 input
    		//start = mid;
    		start = mid + 1;
    		return guessRangeNonRecursive();
    	} else if(temp < 0) {
    		end = mid;
    		return guessRangeNonRecursive();
    	} else {
    		found = true; 
    		return mid;
    	}
    }}