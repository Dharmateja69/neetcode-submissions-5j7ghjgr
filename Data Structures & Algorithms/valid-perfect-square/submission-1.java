class Solution {
    public boolean isPerfectSquare(int num) {

            boolean flag=true;
            for(int i=1;i<=num;i++) {
                if(i*i == num){
                    return true;
                }
            }  
            return false;    
    }
}