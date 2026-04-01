class Solution {
    public int missingNumber(int[] nums) {
        long sum=0;
        for(int i=1;i<=nums.length;i++){
            sum+=i;
        }
        long sum1=0;
        for(int j=0;j<nums.length;j++){
            sum1+=nums[j];
        }
        return (int)(sum-sum1);
    }
}
