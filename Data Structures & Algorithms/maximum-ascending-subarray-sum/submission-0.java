class Solution {
    public  int increasing(int[] nums)
    {   
        int max_value = nums[0];
        int count = nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1] ){
                count+=nums[i+1];
                max_value = Math.max(count,max_value);
            }else{
                count = nums[i+1]; 
            }
        }
       return max_value ; 
    }
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        return increasing(nums) ;
    }
}