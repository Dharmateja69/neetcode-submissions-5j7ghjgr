class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       PriorityQueue<Integer> q = new PriorityQueue<>(
        (a,b)->{
            int distA=Math.abs(a-x);
            int distB=Math.abs(b-x);
            if(distA!=distB){
                return distB-distA;
            }
            return b-a;
        }
       );
       for(int i:arr){

            q.offer(i);
            if(q.size()>k){
                q.poll();
            }

       }
       List<Integer> res = new ArrayList<>(q);
Collections.sort(res);

return res;
    }
}