class Solution {
    public int[] findErrorNums(int[] nums) {

        int duplicate = -1;
        int missing = -1;

        for (int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i]);

            if (nums[value - 1] < 0) {
                duplicate = value;
            } else {
                nums[value - 1] = -nums[value - 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}