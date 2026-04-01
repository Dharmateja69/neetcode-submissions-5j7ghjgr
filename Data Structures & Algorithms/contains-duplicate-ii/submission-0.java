class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> res = new HashSet<>();
        int left = 0;
        int right = 0;

        while (right < nums.length) {

            if (res.contains(nums[right])) {
                return true;
            }

            res.add(nums[right]);
            right++;

            if (right - left > k) {
                res.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}
