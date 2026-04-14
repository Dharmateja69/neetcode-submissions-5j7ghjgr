class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m[]  = new int[26];
        int rn[] = new int[26];

        for(int i=0;i<magazine.length();i++){
           m[magazine.charAt(i)-'a']++;
        }
        for(int j=0;j<ransomNote.length();j++){
           rn[ransomNote.charAt(j)-'a']++;
        }

        for(int k=0;k<ransomNote.length();k++){
           int need = rn[ransomNote.charAt(k)-'a'];
           int main = m[ransomNote.charAt(k)-'a'];
                if(need>main){
                  return false;
                }
        }
       return true;
    }
}