class Solution {
    public int pivotIndex(int[] arr) {
       int left  = 0;
       int right = 0;
       for(int i:arr)
       {
           right += i;
       }
       for(int i=0;i<arr.length;i++)
       {
           right -= arr[i];
           if(left==right){
               return i;
           }
           left += arr[i];
           
       }
       return -1; 
    }
}