class Solution {
    public long pickGifts(int[] gifts, int k) {
        //simplest way to create a max heap
        PriorityQueue<Integer> pq  = new PriorityQueue<>((a,b)->b-a);
        for(int i:gifts){
            pq.offer(i);
        }
        while(k-->0){
            int val=pq.poll();
            int rem = (int) Math.sqrt(val);
            pq.offer(rem);
           
        }
        long sum=0;
       while(!pq.isEmpty()){
          sum+=pq.poll();
       }
        return sum;
    }
}