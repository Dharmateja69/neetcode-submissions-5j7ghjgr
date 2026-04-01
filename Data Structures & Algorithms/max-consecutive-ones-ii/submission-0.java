class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
            int left=0;
            int right=0;
            int count=0;
            int max_=0;
            while(right<nums.length){
                  if(nums[right]==0){
                    count++;
                  }
                 
                     while(count>1){
                        if(nums[left]==0) count--;
                      left++;
                     }

             max_=Math.max(right-left+1,max_);
             right++;

            }

            return max_;


    }
}
