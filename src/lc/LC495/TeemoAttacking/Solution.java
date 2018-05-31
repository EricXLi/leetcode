package lc.LC495.TeemoAttacking;

class Solution {
    //Thoughs: move along the array, two pointers
    //  if next one < this one + duration, add difference instead of duration, that's it
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTime = 0;
        int temp = 0;
        //did not consider the case where no attack lol
        if(timeSeries.length == 0){
            return 0;
        }
        if(timeSeries.length == 1){
            return duration;
        }
        for(int i = 0, j = 1; j < timeSeries.length ; i++, j++){
            temp = timeSeries[j] - timeSeries[i];
            if(temp < duration){
                totalTime += temp;
            } else {
                totalTime += duration;
            }
        }
        //And there will another duration after last attack
        return totalTime+duration;
        }
}