class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> s1 = new LinkedHashMap<>();
        Map<Character, Integer> s2 = new LinkedHashMap<>();

        // store first occurrence index
        for (int i = 0; i < s.length(); i++) {
            s1.putIfAbsent(s.charAt(i), i);
            s2.putIfAbsent(t.charAt(i), i);
        }

        // now compare patterns
        for (int i = 0; i < s.length(); i++) {
            if (!s1.get(s.charAt(i)).equals(s2.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
