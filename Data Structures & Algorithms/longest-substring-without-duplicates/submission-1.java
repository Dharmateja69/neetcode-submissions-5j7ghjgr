class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int n=s.length();
        int max_=Integer.MIN_VALUE;
        Set<Character> ch = new HashSet<>();
        if(n==0){
            return 0;
        }
        while(r<n){
           
           while(ch.contains(s.charAt(r))){
            ch.remove(s.charAt(l));
            l++;
           }
           ch.add(s.charAt(r));
           max_=Math.max(max_,r-l+1);
           r++;

        }
        return max_;
    }
}
