package lc.LC381.InsertDeleteGetRandomDuplicatesAllowed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


/////////////////////////////////////////////
//////FREAKING ACCEPTED!!!!!!!///////////////
/////////////////////////////////////////////
public class RandomizedCollectionHashMapArrayList {
	private Map<Integer, List<Integer>> map;
	private List<Integer> list;
	private int endIndex = -1;
	private Random rdm = new Random();

	/** Initialize your data structure here. */
    public RandomizedCollectionHashMapArrayList() {
        this.map = new HashMap<>();
        this.list = new ArrayList<>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int key) {
        boolean notExist = true;
        List<Integer> indexList;
        addToList(key, endIndex);
        if(map.containsKey(key)){
        	notExist = false;
        	indexList = map.get(key);        	
        } else {
        	indexList = new ArrayList<>();
        }
        indexList.add(endIndex);
        map.put(key,indexList);
        return notExist;
    }
    


	/** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int key) {
        if(map.containsKey(key)){
            List<Integer> indexList = map.get(key);
            int removeIndex = indexList.get(0);
            if(indexList.size() > 1){
            	indexList.remove(0);
            	map.put(key, indexList);
            } else {
                map.remove(key);
            }
            mapIndexSwitch(removeIndex);
            removeFromList(key, removeIndex);
            
            return true;
        } else {
            return false;
        }
    }
    
    
    /** Get a random element from the collection. */
    public int getRandom() {
    	//just return a random number in range 0 - endIndex
    	return this.list.get(rdm.nextInt(this.endIndex + 1));
    }
    
    private void addToList(int val, int endIndex) {
    	// <= instead of ==, 0 case will fail
    	if(list.size() <= (endIndex + 1)) {
    		list.add(val);
    	} else {
    		//TODO: This is how arrayList assign works
    		list.set(endIndex + 1, val);    		
    	}
    	this.endIndex = endIndex + 1;
	}
    
    private void removeFromList(int val, int removeIndex) {
    	
    	this.list.set(removeIndex, list.get(this.endIndex));
    	this.endIndex--;
    }
    
    private void mapIndexSwitch(int removeIndex) {
    	int switchValue = this.list.get(this.endIndex);
    	if(this.map.containsKey(switchValue)) {
        	List<Integer> indexList = this.map.get(switchValue);

        	for(int i = 0 ; i < indexList.size(); i ++) {
        		if(indexList.get(i) == this.endIndex) {
        			indexList.set(i, removeIndex);
        		}
        	}
        	map.put(switchValue, indexList);
    	}

    	
    }
    
    
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
