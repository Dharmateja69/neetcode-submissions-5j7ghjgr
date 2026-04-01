class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int leftMost = findleft(nums,target);
        int rightmost = findright(nums,target);
        return new int[]{leftMost,rightmost};
    }
    int findleft(int nums[],int t){
        int left=0;
        int right=nums.length-1;
        int leftmost=-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            if(nums[mid]==t){
                leftmost=mid;//possiable answer 
                right=mid-1;
            }else if(nums[mid]<t){
             left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return leftmost;
    }
      int findright(int nums[],int t){
        int left=0;
        int right=nums.length-1;
        int rightmost=-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            if(nums[mid]==t){
                rightmost=mid;//possiable answer 
                left=mid+1;
            }else if(nums[mid]<t){
             left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return rightmost;
    }
}