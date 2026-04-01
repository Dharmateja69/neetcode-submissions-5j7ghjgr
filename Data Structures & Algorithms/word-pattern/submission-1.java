
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> rev = new HashMap<>();

        String[] st = s.split(" ");
        
        if (pattern.length() != st.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = st[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (rev.containsKey(word) && rev.get(word) != ch) {
                    return false;
                }
                map.put(ch, word);
                rev.put(word, ch);
            }
        }

        return true;
    }
}