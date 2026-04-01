class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        boolean previous_pair_flag = false;
      for(int i = 0;i<nums.length-1;i++)
      {    //if 1st is even then 
           if(nums[i]%2==0 && nums[i+1]%2!=0){
                previous_pair_flag = true;
           }
          else if( nums[i]%2!=0 && nums[i+1]%2==0){
                 previous_pair_flag = true ;
           }else{
            if(!previous_pair_flag){
               return false;
            }
           }
         previous_pair_flag = false ;
           
      }

    return true;
    }
}