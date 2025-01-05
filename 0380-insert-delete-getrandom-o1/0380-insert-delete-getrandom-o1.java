import java.util.*;
class RandomizedSet {
        HashMap<Integer, Integer> map = new HashMap<>();
        Random rand = new Random();

    public RandomizedSet() {


    }

    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        else {
            map.put(val, val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            map.remove(val);
            return true;
        } else
            return false;

    }

    public int getRandom() {
        Collection<Integer> values=map.values();
        List<Integer> list = new ArrayList<>(values);

        int randomNum = rand.nextInt(map.size()); 

        return list.get(randomNum);

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */