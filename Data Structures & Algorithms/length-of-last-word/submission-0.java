class Solution {
    public int lengthOfLastWord(String s) {
        String[] str= s.trim().split(" ");
        String lastword=str[str.length-1];
        return lastword.length();
    }
}