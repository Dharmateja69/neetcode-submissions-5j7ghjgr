class Solution {
    public int[] sortedSquares(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int index = nums.length - 1;
        int[] res = new int[nums.length];

        while (i <= j) {   // FIXED
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];

            if (left > right) {
                res[index--] = left;
                i++;
            } else {
                res[index--] = right;
                j--;
            }
        }

        return res;
    }
}
