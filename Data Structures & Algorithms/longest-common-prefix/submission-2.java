class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common_prefix="";
        String first_String = strs[0];
        for(int i=0;i<first_String.length();i++){
            char ch=first_String.charAt(i);
         for(int j=1;j<strs.length;j++){
            String word=strs[j];
            if(i >= word.length() || ch != word.charAt(i)){
               return common_prefix;
            }
         }
         common_prefix+=ch;
        }
        return common_prefix;
    }
}