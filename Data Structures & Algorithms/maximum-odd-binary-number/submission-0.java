class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        int zero=0;
        for(char  i:s.toCharArray()){
            if(i=='1'){
                one++;
            }else{
                zero++;
            }
        }
        String new_s = "";
        for(int i=0;i<one-1;i++){
            new_s+="1";
        }
        for(int j=0;j<zero;j++)
        {
            new_s+="0";
        }
        new_s+="1";
      return new_s;

    }
}