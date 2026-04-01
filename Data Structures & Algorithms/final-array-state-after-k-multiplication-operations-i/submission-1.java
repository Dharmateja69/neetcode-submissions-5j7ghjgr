class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0]; // compare value
                return a[1] - b[1];                  // compare index
            }
        );

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
        }

        while (k-- > 0) {
            int[] cur = pq.poll();
            int val = cur[0];
            int idx = cur[1];

            int newVal = val * multiplier;
            nums[idx] = newVal;

            pq.offer(new int[]{newVal, idx});
        }

        return nums;
    }
}
