class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int l=0;
        int r=0;
        Map<Character,Integer> res  = new HashMap<>();
        int max_= Integer.MIN_VALUE;
        while(r<s.length()){
         res.put(s.charAt(r),res.getOrDefault(s.charAt(r),0)+1);
         while(res.size()>k){
            res.put(s.charAt(l),res.getOrDefault(s.charAt(l),0)-1);
            if(res.get(s.charAt(l))==0){
                res.remove(s.charAt(l));
            }
            l++;
         }
         max_=Math.max(r-l+1,max_);

         r++;


        }
        return max_;
    }
}
