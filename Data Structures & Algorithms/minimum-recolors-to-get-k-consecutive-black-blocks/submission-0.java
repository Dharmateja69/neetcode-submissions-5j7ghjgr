class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min_operations=Integer.MAX_VALUE;

        for(int i=0;i+k<=blocks.length();i++){
            int count=0;
            int m=k;
            for(int j=i;j<i+k;j++){
                char ch=blocks.charAt(j);
              
                if(ch=='W'){
                    count++;
                }
                m--;
            }
              if(m==0){
                    min_operations=Math.min(count,min_operations);
                }
            
        }
        return min_operations;
    }
}