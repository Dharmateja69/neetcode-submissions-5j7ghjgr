class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            if(!s.contains(i)){
                s.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
}