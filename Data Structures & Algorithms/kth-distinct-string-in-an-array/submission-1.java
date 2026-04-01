class Solution {
    public String kthDistinct(String[] arr, int k) {
      Map<String,Integer> res = new LinkedHashMap<>();
      List<String>  li  = new ArrayList<>();
      for(int i=0;i<arr.length;i++)
      {
          res.put(arr[i],res.getOrDefault(arr[i],0)+1);
      }
     
     for(Map.Entry<String,Integer> key : res.entrySet())
     {
         String s  =  key.getKey();
         int    c  =  key.getValue();   
         if(c==1){
             li.add(s);
         }
     }

     return li.size()>=k?li.get(k-1):"";
    }
}