class Solution {
    public boolean countpairs(int []n,int mid,int p)
    {
        int count=0;
        int i=0;
        while(i<n.length-1){
           if(n[i+1]-n[i]<=mid){
            i+=2;
            count++;
           }else{
            i++;
           }
        }
        return count>=p;//atleeast
    }
    public int minimizeMax(int[] nums, int p) {
        int left=0;
        Arrays.sort(nums);
        int right=nums[nums.length-1]-nums[0];
        int result=Integer.MAX_VALUE;
        while(left<right){
            int mid= left+ (right-left)/2;

            if(countpairs(nums,mid,p)){
             
             right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}