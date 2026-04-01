class Solution {
    public boolean check(int[] nums) {
        int count_breaks = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                count_breaks++;
            }
        }

        // check circular break (last → first)
        if(nums[nums.length - 1] > nums[0]){
            count_breaks++;
        }

        return count_breaks <= 1;
    }
}