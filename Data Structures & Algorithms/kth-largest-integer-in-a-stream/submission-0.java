class KthLargest {
       PriorityQueue<Integer> res;
       int k;
    public KthLargest(int k, int[] nums) {
        res = new PriorityQueue<>();
        this.k=k;
        for(int i:nums){
          res.offer(i);
          if(res.size()>k){
            res.poll();
          }
        }
    }
    
    public int add(int val) {
        res.offer(val);
        if(res.size()>k){
            res.poll();
        }
        return res.peek();
    }
}
