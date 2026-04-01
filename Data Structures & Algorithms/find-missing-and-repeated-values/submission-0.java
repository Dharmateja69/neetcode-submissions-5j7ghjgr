class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n  = grid.length;
        int arr[] = new int[n*n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              arr[index++] = grid[i][j];
            }
        }

        for(int k=0;k<n*n;k++)
        {
          int ind = Math.abs(arr[k]);
             ind-=1;
            if(arr[ind]<=0){
              continue;
            }else{
                arr[ind] = -arr[ind];
            }
        }
        int val = 0;
        int repated = 0;
        for(int m=0;m<n*n;m++){
            if(arr[m]>0){
              repated  = arr[m];   
              val      =  m+1;
              break;
            }
        }


        return new int[]{repated,val };
    }
}