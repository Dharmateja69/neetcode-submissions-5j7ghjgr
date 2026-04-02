class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean   up  = false;
        boolean  down = false;
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                up = true;
                break;
            }else if(nums[i]>nums[i+1]) {
                down = true;
                break;
            }
         }
         //up
         if(up){
         for(int i=0;i<nums.length-1;i++)
         {
              if(nums[i]>nums[i+1])
              {
                return false;
              }
         }
         }else{
            //down
         for(int i=0;i<nums.length-1;i++)
         {
                if(nums[i]<nums[i+1])
              {
                return false;
              }
         }
         }
         

        return true;
    }
}