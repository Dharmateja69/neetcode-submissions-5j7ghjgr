class Solution {
    public boolean divideArray(int[] nums) {
        
        if(nums.length<=1){
          return false;
        }
        int pairs = nums.length/2;
        int count = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]==nums[i+1]){
               count++;
              
            }
        }
        if(count==pairs){
            return true;
        }
       return false;
    }
}