class Solution {
    public int arrangeCoins(int n) {
      int coins=0;
      int coinsleft=n;
      int i=1;
      while(coinsleft>=i){
         coins++;
         coinsleft-=i;
         i++;
      }




        return coins ;
    }
}