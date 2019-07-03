package lc.LC1014.bestSightseeingPair;

//  I only care about a max so far, aka value - distance, each step we take, all the values decrease by 1, so potentially an linked list with the next biggest number? 
//  not really, if it is not biggest back then it will not be biggest now, all I care about is value - (i - a(where the max value is at)) and we only compare this value
//  aka we keep track of(A[i] + i - j)
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Best Sightseeing Pair.
//Memory Usage: 50.5 MB, less than 75.14% of Java online submissions for Best Sightseeing Pair.

class SolutionOnePass {
    public int maxScoreSightseeingPair(int[] A) {
        int max = Integer.MIN_VALUE;
        int runningNodeMax = A[0];
        for(int i = 1 ; i < A.length ; i++) {
        	runningNodeMax--;
        	max = (A[i]+runningNodeMax > max) ? A[i]+runningNodeMax :  max;
        	runningNodeMax = (A[i] > runningNodeMax) ? A[i] : runningNodeMax;
        }
        return max;
    }
}
