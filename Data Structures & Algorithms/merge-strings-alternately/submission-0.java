class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st = new StringBuilder();
        int i=0;
        int j=0;
        boolean toggle=true;
        while(i<word1.length() && j<word2.length()){
              if(toggle){
                st.append(word1.charAt(i));
                
                i++;
              }
              if(!toggle){
                st.append(word2.charAt(j));
                 j++;
              }
              toggle=!toggle;
        }
        while(i<word1.length()){
            st.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            st.append(word2.charAt(j));
            j++;
        }
        return st.toString();
    }
}