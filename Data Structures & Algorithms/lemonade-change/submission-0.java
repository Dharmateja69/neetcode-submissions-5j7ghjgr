class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int b:bills){
          if(b==5){
            five+=1;
          }
          if(b==10){
            if(five>0){
                five-=1;
                ten+=1;
            }else{
                return false;
            }
          }
          if(b==20){
            //2 case
            if(ten>0 && five>0){
                ten-=1;
                five-=1;
            }
            else if(five>=3){
                five-=3;
            }else{
                return false;
            }
          }
        }
        return true;
    }
}