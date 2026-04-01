class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(-1);
        int i=arr.length-1;
        while(i>=0){
        
        if(st.peek()<arr[i]){
          int val=st.pop();
          st.push(arr[i]);
          res[i]=val;
        }else if(st.peek()>=arr[i]){
            res[i]=st.peek();
        }
         i--;
        }
        return res;
    }
}