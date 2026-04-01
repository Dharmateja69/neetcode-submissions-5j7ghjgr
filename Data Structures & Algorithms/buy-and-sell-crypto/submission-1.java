class Solution {
    public int maxProfit(int[] nums) {
        int max_profit=0;
        int profit=0;
        int left=0;
        int right=0;
        while(right<nums.length){

              if(nums[right]<nums[left]){
                left=right;
              }
              profit = nums[right]-nums[left];
              max_profit=Math.max(max_profit,profit);
              right++;
        }
        return max_profit;
    }
}
