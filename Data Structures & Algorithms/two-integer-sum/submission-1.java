class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<>();
        int resl[] = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (res.containsKey(remaining)) {
                resl[0] = res.get(remaining);
                resl[1] = i;
                return resl;
            }
            res.put(nums[i], i);
        }
        
        return resl;
    }
}
