class Solution {
    public boolean search(int[] nums, int target) {
       Map<Integer,Integer> res = new HashMap<>();
       for(int i:nums){
        res.put(i,res.getOrDefault(i,0)+1);
       }
       if(res.containsKey(target)){
        return true;
       }
       return false;
    }
}