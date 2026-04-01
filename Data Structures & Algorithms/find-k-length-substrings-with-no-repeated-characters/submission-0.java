class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        int l = 0;
        int r = 0;
        Set<Character> window = new HashSet<>();
        int count = 0;
        while (r < s.length()) {
            char currentChar = s.charAt(r);
            while (window.contains(currentChar)) {
                window.remove(s.charAt(l));
                l++;
            }
            window.add(currentChar);
            if (window.size() > k) {
                window.remove(s.charAt(l));
                l++;
            }
            if (window.size() == k && (r - l + 1) == k) {
                count++;
            }
            r++;
        }
        return count;
    }
}
