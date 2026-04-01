class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int max_=Integer.MIN_VALUE;
        Map<Character,Integer> res = new HashMap<>();
        while(r<s.length()){
           res.put(s.charAt(r),res.getOrDefault(s.charAt(r),0)+1);
           int max_freq = Collections.max(res.values());
           while((r-l+1)-max_freq>k){
            res.put(s.charAt(l),res.getOrDefault(s.charAt(l),0)-1);
            l++;
           }
       
            max_ = Math.max(r-l+1,max_);
            r++;
         

        }
        return max_;
    }
}
