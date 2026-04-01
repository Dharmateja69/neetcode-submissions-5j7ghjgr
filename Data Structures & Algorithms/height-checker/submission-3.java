class Solution {
    public int heightChecker(int[] heights) {
        int e[] =  heights.clone();
        int c = 0;
        Arrays.sort(e);
        for(int i=0;i<e.length;i++){
            if(heights[i] != e[i]){
               c++;
            }
        }
      return c;
    }
}