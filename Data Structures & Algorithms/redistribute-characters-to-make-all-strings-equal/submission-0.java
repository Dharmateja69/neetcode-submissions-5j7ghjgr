class Solution {
    public boolean makeEqual(String[] words) {
       int arr[] = new int[26];
       int n = words.length;
       for(int i=0;i<words.length;i++){
        String s = words[i];
          for(int j=0;j<s.length();j++){
           arr[s.charAt(j)-'a']++;
          }
       } 
       for(int k=0;k<arr.length;k++){
         if(arr[k]>0 && arr[k]%n !=0){
          return false;
         }
       }
       return true;
    }
}