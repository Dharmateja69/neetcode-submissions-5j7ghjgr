class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int left =0;
        int right=0;
        int t=0;
        int count=0;//count the subarrays which meets the requirements
        while(right<arr.length){

                  t+=arr[right];

                 if(right-left+1>k){
                    t-=arr[left++];
                    
                    
                 }

                 if(right-left+1==k){
                    int div= t/k;
                    if(div>=threshold){
                        count++;
                    }
                    
                 }
                
                 right++;
        }
        return count;
    }
}