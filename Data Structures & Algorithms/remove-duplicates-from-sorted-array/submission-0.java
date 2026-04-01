class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> st = new LinkedHashSet<>();

        // Collect uniques
        for (int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }

        // Write back into nums
        int idx = 0;
        for (int val : st) {
            nums[idx++] = val;
        }

        return st.size();
    }
}
