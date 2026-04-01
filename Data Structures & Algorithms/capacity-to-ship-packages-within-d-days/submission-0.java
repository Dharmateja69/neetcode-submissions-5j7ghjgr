class Solution {
    public boolean count_days(int []w,int leastw,int d){
        int count=0;
        int sum=0;
              for(int i=0;i<w.length;i++){
                if(w[i]>leastw){
                    return false;
                }
                if(sum+w[i]>leastw)
                {
                  count++;
                  sum=w[i];
                }else{
                    sum+=w[i];
                }
              }
              count++;
        return count<=d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int i:weights){
            left=Math.max(left,i);
        }
        for(int j:weights){
            right+=j;
        }
        while(left<right){
            int mid= left+ (right-left)/2;
            if(count_days(weights,mid,days))
            {
               right=mid;
            }else{
                  left=mid+1;
            }
        }
        return left;
    }
}