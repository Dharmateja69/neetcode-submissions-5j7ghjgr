class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        Set<Character> main = new HashSet<>();
        for(int m =0;m<allowed.length();m++){
          main.add(allowed.charAt(m));
        }
     for(int i=0;i<words.length;i++){
         Set<Character> r = new HashSet<>();
         String s = words[i];
         boolean flag = true;
        for(int j=0;j<s.length();j++){
         if(!r.contains(s.charAt(j))){
            r.add(s.charAt(j));
         }
        }
        for(char c:r){
            if(!main.contains(c)){
           flag = false;
            break;
            }
        }
         if(flag){
            count++;
         }
    }

     
    return count ;
    }
}