class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l=0;
        int r=0;
        int max_= Integer.MIN_VALUE;
        int windowsum=0;
        Arrays.sort(nums);
        while(r<nums.length){
            windowsum+=nums[r];

            while((r-l+1)*nums[r]-windowsum>k){
               windowsum-=nums[l];
               l++;
            }

           max_=Math.max(r-l+1,max_);
           r++;
        }
        return max_;
    }
}