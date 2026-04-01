class Solution {
   public int missingElement(int[] nums, int k) {
    int left = 0, right = nums.length - 1;
    int n = nums.length;
    
    // Calculate total missing numbers in the array range
    int totalMissing = nums[right] - nums[0] - (right - left);
    
    // If k is beyond the array, answer is after last element
    if (k > totalMissing) {
        return nums[right] + (k - totalMissing);
    }
    
    // Binary search for the position
    while (left < right) {
        int mid = left + (right - left) / 2;
        int missing = nums[mid] - nums[0] - mid;
        
        if (missing < k) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    
    // Calculate kth missing number
    return nums[0] + k + left - 1;
}

}
