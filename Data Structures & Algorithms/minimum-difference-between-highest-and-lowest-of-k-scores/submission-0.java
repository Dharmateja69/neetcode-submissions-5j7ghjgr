class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min_score=Integer.MAX_VALUE;
         Arrays.sort(nums);
           for(int i=0;i+k-1<nums.length;i++){

             int diff = nums[i+k-1]-nums[i];
             min_score=Math.min(diff,min_score);

           }
        return min_score;
    }
}