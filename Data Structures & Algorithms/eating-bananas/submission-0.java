class Solution {
    public boolean count(int pile[],int k,int h){
        long totalcount=0;
        for(int j:pile){
            totalcount+=(j+k-1)/k;
        }
        return totalcount<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
       int left=1;
       int right=0;
       for(int i:piles){
        right=Math.max(i,right);
       } 
       
       while(left<right){
        int mid=left+(right-left)/2;

          if(count(piles,mid,h)){
            right=mid;
          }else{
            left=mid+1;
          }
         
       }
       return left;
    }
}
