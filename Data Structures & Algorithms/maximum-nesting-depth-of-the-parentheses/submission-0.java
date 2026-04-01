class Solution {
    public int maxDepth(String s) {
        int count_depth =0;
        int max_depth=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                count_depth++;
                max_depth=Math.max(max_depth,count_depth);
            }else if(c==')' && count_depth>0){
                count_depth--;
            }
        }
    return max_depth;
    }
}