class Solution {
    public int minOperations(String s) {
        int count =0;
        int countPattern1=0;
        int countPattern2=0;
        char expected1='0';
        char expected2='0';
        for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

         expected1 = (i % 2 == 0) ? '0' : '1';
         expected2 = (i % 2 == 0) ? '1' : '0';

    if (ch != expected1) countPattern1++;
    if (ch != expected2) countPattern2++;
        
    }
    if(countPattern1>countPattern2){
    return countPattern2;
    }
    return countPattern1;
    }
}