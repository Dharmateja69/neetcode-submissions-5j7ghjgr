class Solution {

    public boolean validpartition(int[] nums, int x, int k) {
        int partitions = 1;
        int currentsum = 0;

        for (int i : nums) {
            if (i > x) {
                return false;
            }
            if (currentsum + i <= x) {
                currentsum += i;
            } else {
                currentsum = i;
                partitions++;
            }
        }
        return partitions <= k;
    }

    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;

        for (int i : nums) {
            left = Math.max(left, i);
            right += i;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (validpartition(nums, mid, k)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
