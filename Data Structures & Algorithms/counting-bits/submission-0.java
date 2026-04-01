class Solution {
    public int count(int n){
        int c=0;
        int i=0;
        while(n!=0){
            if(n%2==1){
                c++;
            }
            n/=2;
        }
        return c;

    }
    public int[] countBits(int n) {
        int arr[]= new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=count(i);
        }
        return arr;
    }
}
