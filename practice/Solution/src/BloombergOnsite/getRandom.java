package BloombergOnsite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
    List<Integer> number;
    Map<Integer , Integer> map;
    Random r = new Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        number = new ArrayList<Integer>();
        map = new HashMap<Integer , Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val , number.size());
        number.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int position = map.get(val);
        if(position < number.size()){
            int num = number.get(number.size() - 1);
            number.set(position , num);
            map.put(num , position);
            
        }
        map.remove(val);
        number.remove(number.size() - 1);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return number.get(r.nextInt(number.size()));
    }
}


