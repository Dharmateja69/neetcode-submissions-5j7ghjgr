class Solution {
    public int heightChecker(int[] heights) {
        int exp[] =  heights.clone();
        int c = 0;
        Arrays.sort(exp);
        for(int i=0;i<heights.length;i++){
            if(heights[i] != exp[i]){
               c++;
            }
        }
      return c;
    }
}