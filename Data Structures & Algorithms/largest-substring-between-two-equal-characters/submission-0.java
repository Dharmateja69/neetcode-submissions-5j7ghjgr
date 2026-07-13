class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> res = new HashMap<>();
        int max_count = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!res.containsKey(ch)) {
                res.put(ch, i);
            } else {
                int index = res.get(ch);   
                max_count = Math.max(max_count, i - index - 1);
            }
        }
        return max_count;
    }
}