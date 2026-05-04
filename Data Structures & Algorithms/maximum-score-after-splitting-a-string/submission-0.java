class Solution {
   public static int maxScore(String s) {
        int n = s.length();
        
        int rightOnes = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                rightOnes++;
            }
        }

        int leftZeros = 0;
        int maxScore = 0;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }

            maxScore = Math.max(maxScore, leftZeros + rightOnes);
        }

        return maxScore;
    }
}