class Solution {
    public int maxDifference(String s) {
        int max_odd = 0;
        int min_even = Integer.MAX_VALUE;

        Map<Character,Integer> res = new HashMap<>();
        for(char c:s.toCharArray()){
            res.put(c,res.getOrDefault(c,0)+1);
        }
        for(int i:res.values()){
          if(i%2!=0){
           max_odd =Math.max(max_odd,i);
          }else{
           min_even =Math.min(min_even,i);
          }
        }
        return max_odd-min_even;

    }
}