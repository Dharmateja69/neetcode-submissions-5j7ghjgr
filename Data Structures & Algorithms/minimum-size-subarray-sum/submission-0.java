class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int min_= Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
           while(sum>=target){
              min_=Math.min(r-l+1,min_);
              sum-=nums[l];
              l++;
           }
            r++;
        }
        if(min_>=Integer.MAX_VALUE){
            return 0;
        }
        return min_;
    }
}