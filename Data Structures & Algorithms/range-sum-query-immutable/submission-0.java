class NumArray {
   int prefixnums[];
    public NumArray(int[] nums) {
      prefixnums = new int[nums.length + 1];
      prefixnums[0] = nums[0];
      for(int i=1;i<nums.length ;i++){
         prefixnums[i]=prefixnums[i-1]+nums[i];
      }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prefixnums[right];
        }
        return prefixnums[right]-prefixnums[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */