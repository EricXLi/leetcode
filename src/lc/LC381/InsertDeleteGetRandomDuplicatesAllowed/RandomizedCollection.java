package lc.LC381.InsertDeleteGetRandomDuplicatesAllowed;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomizedCollection {
    //private Map<int, int> map;
	//Map only allows boxed classes
	private Map<Integer, Integer> map;
    private int total;
    private Map<Integer, Integer> countMap;
    
    public Map<Integer, Integer> getCountMap() {
		return countMap;
	}

	public void setCountMap(Map<Integer, Integer> countMap) {
		this.countMap = countMap;
	}

	/** Initialize your data structure here. */
    public RandomizedCollection() {
        this.map = new HashMap<>();
        this.total = 0;
        //for getRandom use only, to get the distribution for TC 28
        this.countMap = new HashMap<>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        int count = 1; //adding count
        boolean exist = true;
        if(map.containsKey(val)){
            count += map.get(val);
            exist = false;
        }        
        map.put(val,count);
        this.total++;
        return exist;}
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int count = map.get(val);
            if(count > 1){
                map.put(val, count - 1);
            } else {
                map.remove(val);
            }
            this.total--;
            return true;
        } else {
            return false;
        }
    }
    
    
    /** Get a random element from the collection. */
    public int getRandom() {
        //return a default (max# one) if didn't accept any
        //so the algorithm will be go through the key set, accept by the chance of #/total
        //if not accepted, move on to next one, this can make a linear relavance
        //to make it easier, get random number (1-total), accept if the random number is less or equal to the # of this number
        Random rdm = new Random();
//        int maxCount = 0;
//        int maxKey = 0;
        int rand = 0;
        boolean retValue = false;
        while(!retValue) {
        	for(int key : map.keySet()){            
                int val = map.get(key);
                /*
                if(maxCount <= val) {

                    maxCount = val;
                    maxKey = key;
                }
                */
                
                rand = rdm.nextInt(this.total) + 1;
                /**/
            	if(countMap.get(rand * -1) == null) {
            		countMap.put(rand * -1, 0);
            	} else {
            		countMap.put(rand * -1, countMap.get(rand*-1) + 1);
            	}
            	/**/
                if(rand <= val){
                	/**/
                	if(countMap.get(key) == null) {
                		countMap.put(key, 0);
                	} else {
                		countMap.put(key, countMap.get(key) + 1);
                	}
                	/**/
                	retValue = true;
                    return key;
                }
            }        	
        }
        return 0;
        
        // Remove this piece to do loop back to ensure pick random.
        // If we always accept maxCount, say we have three elements, two elements will have a prob of 1/3, the last one is 4/9
        /*
        if(countMap.get(maxKey) == null) {
    		countMap.put(maxKey, 0);
    	} else {
    		countMap.put(maxKey, countMap.get(maxKey) + 1);
    	}
    	//
        return maxKey;
        */
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
