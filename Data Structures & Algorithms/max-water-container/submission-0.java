class Solution {
    public int maxArea(int[] h) {
        int max_contains=0;
        int left=0;
        int right=h.length-1;
        int area=0;
        while(left<right){
            area=(right-left)*Math.min(h[left],h[right]);
            max_contains=Math.max(area,max_contains);
            if(h[left]<h[right]){
                left++;
            }else {
                right--;
            }
            
        }
        return max_contains;
    }
}
