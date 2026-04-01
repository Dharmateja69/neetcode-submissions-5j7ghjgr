class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int sum=0;
        int max_=Integer.MIN_VALUE;
        while(r<nums.length){
             sum+=nums[r];
             while((r-l+1)-sum>k){
                sum-=nums[l];
                l++;
             }
             max_=Math.max(r-l+1,max_);
             r++;
        }
        return max_;
    }
}