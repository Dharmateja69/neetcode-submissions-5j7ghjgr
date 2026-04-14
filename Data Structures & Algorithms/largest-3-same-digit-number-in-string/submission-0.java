class Solution {
    public String largestGoodInteger(String num) {
        String res = "";
        
        for(int i = 0; i < num.length() - 2; i++){
            char a = num.charAt(i);
            char b = num.charAt(i + 1);
            char c = num.charAt(i + 2);
            
            if(a == b && b == c){
                String curr = "" + a + b + c;
                if(res.equals("") || curr.compareTo(res) > 0){
                    res = curr;
                }
            }
        }
        
        return res;
    }
}