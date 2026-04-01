class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         List<Integer> res = new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           int index = Math.abs(arr[i])-1;
           if(index<0  ){
               continue;
           } else if(index>=0){
               if(arr[index]<0){
                   continue;
               }
               arr[index] = -arr[index];
           }
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
               res.add(i+1);
           }
       }
       return res;
    }
}