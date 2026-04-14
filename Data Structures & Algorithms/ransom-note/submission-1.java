class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] m = new int[26];

        // Count characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            m[magazine.charAt(i) - 'a']++;
        }

        // Use characters for ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (m[ch - 'a'] == 0) {
                return false;
            }
            m[ch - 'a']--;
        }

        return true;
    }
}