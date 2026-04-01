class Solution {
    public char findTheDifference(String s, String t) {
        long s_sum=0;
        long t_sum=0;
        for(char c:s.toCharArray()){
             s_sum+=(c+0);
        }
        for(char ch:t.toCharArray()){
            t_sum+=(ch+0);
        }
        char ch = (char)Math.abs(s_sum-t_sum);
        return ch;
    }
}