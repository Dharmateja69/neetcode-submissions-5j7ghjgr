class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> res = new HashMap<>();
        int max= (nums.length/2)+1;
        for(int i:nums){
            res.put(i,res.getOrDefault(i,0)+1);
        }
       for(Map.Entry<Integer,Integer> e: res.entrySet()){
         int val =e.getValue();
         int key=e.getKey();
         if(val>=max){
            return key;
         }
       }
       return 0;

    }
}