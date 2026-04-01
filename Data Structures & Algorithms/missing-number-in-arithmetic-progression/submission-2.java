class Solution {
    public int missingNumber(int[] arr) {
        int d= (arr[arr.length-1]-arr[0])/arr.length;
        int missing=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+d!=arr[i+1] ){
                return arr[i]+d;
            }
        }
        return arr[0]+d;
    }
}
