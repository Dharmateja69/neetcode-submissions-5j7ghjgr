class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[] = new int[nums.length];
        int index=0;
        for(int i:nums){
            if(i%2==0){
                res[index++]=i;
            }
        }
        for(int j:nums){
            if(j%2!=0){
                res[index++]=j;
            }
        }
        return res;
    }
}