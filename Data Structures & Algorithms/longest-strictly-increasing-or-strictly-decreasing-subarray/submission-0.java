class Solution {
     public  int decreasing(int[] nums)
    {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int max_value = 1;
        int count = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1] ){
                count++;
                max_value = Math.max(count,max_value);
            }else{
                count=1; 
            }
        }
       return max_value ; 
    }
    public  int increasing(int[] nums)
    {    
        int max_value = 1;
        int count = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1] ){
                count++;
                max_value = Math.max(count,max_value);
            }else{
                count=1; 
            }
        }
       return max_value ; 
    }
    public int longestMonotonicSubarray(int[] nums) {

         if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int max_increasing = increasing(nums);
        int max_decreasing = decreasing(nums);
        return max_increasing >= max_decreasing? max_increasing:max_decreasing;
    }
}