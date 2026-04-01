class Solution {
    public int findLucky(int[] arr) {
     Map<Integer,Integer> res = new HashMap<>();
     for(int i=0;i<arr.length;i++){
        res.put(arr[i],res.getOrDefault(arr[i],0)+1);
     }
     int max = Integer.MIN_VALUE;
     for(Map.Entry<Integer,Integer> k: res.entrySet()){
          int key = k.getKey();
          int val = k.getValue();
          if(key==val){
           max = Math.max(max,val);
          }
     }
     if(max == Integer.MIN_VALUE)
     {
          return -1; 
     }
        return max;
    }
}