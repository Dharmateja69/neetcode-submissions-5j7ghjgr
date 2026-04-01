class Solution {
    public int totalFruit(int[] nums) {
        int l=0;
        int r=0;
        int max_=Integer.MIN_VALUE;
        Map<Integer,Integer> res =  new HashMap<>();
        while(r<nums.length){
         res.put(nums[r],res.getOrDefault(nums[r],0)+1);
         while(res.size()>2){
          res.put(nums[l],res.getOrDefault(nums[l],0)-1);
           if(res.get(nums[l])==0){
            res.remove(nums[l]);
           }
           l++;
         }
         max_=Math.max(r-l+1,max_);
         r++;
        }
      return max_;
    }
}