class RandomizedSet {
    private ArrayList<Integer> list;
    private HashSet<Integer> set;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        set = new HashSet<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }

        set.add(val);
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
       if(!set.contains(val)){
        return false;
       }

        set.remove(val);
        list.remove(Integer.valueOf(val));
        return true;
    }
    
    public int getRandom() {
        if(list.isEmpty()){
            throw new IllegalStateException("Set is empty");  
        }
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
        
}


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */