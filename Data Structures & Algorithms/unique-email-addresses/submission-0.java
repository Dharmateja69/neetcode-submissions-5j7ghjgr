class Solution {
    public int numUniqueEmails(String[] emails) {
       Set<String> res = new HashSet<>();
       for(String s : emails)
       {
           StringBuilder sc  = new StringBuilder();
           for(int i=0;i<s.length();i++)   //localname
           {
               if(s.charAt(i)=='+' || s.charAt(i)=='@')
               {
                   break;
               }else if(s.charAt(i)=='.')
               {
                   continue;
               }else{
                   sc.append(s.charAt(i));
               }
           }
           for(int j = s.length()-1 ; j >= 0; j--)
           {
               if(s.charAt(j)=='@'){
                   sc.append(s.substring(j+1,s.length()));
                   if(!res.contains(sc)){
                       res.add(sc.toString());
                       break;
                   }
               }
           }
        }
        return res.size();
    }
}