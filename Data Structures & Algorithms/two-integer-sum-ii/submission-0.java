class Solution {
    public int[] twoSum(int[] n, int t) {
        int i=0;
        int j=n.length-1;
        int ans[]= new int[2];
        while(i<j){
              if(n[i]+n[j]>t){
                j--;
              }else if(n[i]+n[j]<t){
                i++;
              }else{
                ans[0]=i+1;
                ans[1]=j+1;
                break;
              }
        }
        return ans;
    }
}
