class Solution {

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int l = 0;
        int n = s1.length();

        for (int r = 0; r < s2.length(); r++) {

            char ch = s2.charAt(r);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // If window is too big → shrink from left
            if (r - l + 1 > n) {
                char leftChar = s2.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (window.get(leftChar) == 0) window.remove(leftChar);
                l++;
            }

            // Check if maps match
            if (window.equals(need)) return true;
        }

        return false;
    }
}
