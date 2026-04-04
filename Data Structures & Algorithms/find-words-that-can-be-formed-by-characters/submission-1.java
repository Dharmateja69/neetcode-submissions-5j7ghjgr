class Solution {
    public int countCharacters(String[] words, String chars) {
        int fre[] = new int[26];
        int l = 0;

        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                fre[ch - 'a']++;
            }
        }

        for (int j = 0; j < words.length; j++) {
            int f[] = new int[26];
            String s = words[j];
            boolean flag = true;

            for (int k = 0; k < s.length(); k++) {
                char c = s.charAt(k);
                if (c >= 'a' && c <= 'z') {
                    f[c - 'a']++;
                } else {
                    flag = false;
                    break;
                }
            }

            for (int m = 0; m < s.length() && flag; m++) {
                char ch = s.charAt(m);
                if (ch >= 'a' && ch <= 'z') {
                    if (f[ch - 'a'] > fre[ch - 'a']) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                l += s.length();
            }
        }

        return l;
    }
}