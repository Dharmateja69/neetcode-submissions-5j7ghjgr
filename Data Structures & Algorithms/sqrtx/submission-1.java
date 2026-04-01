class Solution {
    public int mySqrt(int num) {
        long left=1;
        long right=num;
        long ans=0;
        while(left<=right){
            long mid = left+(right-left)/2;
            long sql = mid*mid;
            if(sql==num){
                return (int)mid;
            }else if(sql<num){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return (int)ans;
    }
}