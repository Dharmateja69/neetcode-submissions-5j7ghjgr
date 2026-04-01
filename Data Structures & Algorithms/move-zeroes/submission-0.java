class Solution {
    public void moveZeroes(int[] nums) {
        
       int pos=0;
       for(int i:nums){
        if(i!=0){
        nums[pos++]=i;
        }
       }
       for(int j=pos;j<nums.length;j++){
        nums[j]=0;
       }
        
    }
}