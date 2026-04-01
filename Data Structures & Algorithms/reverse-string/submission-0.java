class Solution {
    public void reverseString(char[] s) {
        char[] st=new char[s.length];
        int index=0;
        for(int i=s.length-1;i>=0;i--){
            st[index++]=s[i];
        }
        for(int j=0;j<st.length;j++){
            s[j]=st[j];
        }
    }
}