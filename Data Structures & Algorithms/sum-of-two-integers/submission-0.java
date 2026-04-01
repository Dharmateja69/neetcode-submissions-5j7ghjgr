class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
          int sum= a^b;//gives the sum
          int carry =(a&b)<<1 ; //carry to the correct position
          a=sum;
          b=carry;
        }
        return a;
    }
}
