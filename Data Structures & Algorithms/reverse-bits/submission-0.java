class Solution {
    public int reverseBits(int n) {
        StringBuilder sc= new StringBuilder();
        int i=0;
       for(i=0;i<32;i++){
            if((n&1)==1){
              sc.append("1");
            }else{
                sc.append("0");
            }
            n>>>=1;
        }
        
        return (int) Long.parseLong(sc.toString(),2);
    }
}
