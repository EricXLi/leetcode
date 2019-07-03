package lc.LC1014.bestSightseeingPair;

import java.util.Stack;
//Just compare each one and run through, exceeds timelimit for later test cases, 48 / 52 test cases passed.

class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int max = -1;
        int temp = -1;
        for(int i = 0 ; i < A.length - 1 ; i ++) {
            for(int j = i + 1 ; j < A.length ; j++) {
                temp = A[j] + A[i] + i - j;
                if(temp > max) {
                    //System.out.println(i +" " + j);
                    max = temp;
                }
            }
        }
        return max;
        
    }
}