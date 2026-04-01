class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int l=0;
       int r=0;
       int mul=1;
       int count=0;
       while(r<nums.length)
       {

        mul*=nums[r];
        while(mul>=k && l<=r){
            mul/=nums[l];
            l++;
        }
        count+=(r-l+1);
        r++;

       }
       return count; 
    }
}