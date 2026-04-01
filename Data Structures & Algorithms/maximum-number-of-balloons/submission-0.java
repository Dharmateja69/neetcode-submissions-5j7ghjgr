class Solution {
    public int maxNumberOfBalloons(String t) {
        Map<Character,Integer>  req_ = new HashMap<>();
        Map<Character,Integer>  need = new HashMap<>();
        int min_value = Integer.MAX_VALUE;
        for(char ch:t.toCharArray())
        { 
            req_.put(ch,req_.getOrDefault(ch,0)+1);
        }
        for(char c:"balloon".toCharArray())
        { 
            need.put(c,need.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> key : need.entrySet()){
            char ch        = key.getKey();
            int  count     = key.getValue();
            int  comparing = req_.getOrDefault(ch,0)/count;
                 min_value = Math.min(min_value,comparing);
        }

        return min_value;
    }
} 