class Solution {
    public int firstUniqChar(String s) {
    int count = -1;
    boolean []arr  = new boolean[26];   
    Set<Character> res = new LinkedHashSet<>();
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
     if(!res.contains(ch)){
        res.add(ch);
        arr[ch-'a'] = true;
    }else{
        arr[ch-'a'] = false;
     }
    }
    //traversing for solution
    for(char c: res){
     if(arr[c-'a']){
        count =  s.indexOf(c);
        break;
     }
    }
     
     return count;
    }

}