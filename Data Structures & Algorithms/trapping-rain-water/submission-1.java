class Solution {
    public int trap(int[] h) {
        //formula  water[i]= min(left,right)-height[i]
        int max_area=0;
        int right_max[]= new int[h.length];
            right_max[h.length-1]=h[h.length-1];
        int left_max[] = new int[h.length];
        left_max[0]=h[0];
        for(int i=1;i<h.length;i++){
            left_max[i]=Math.max(left_max[i-1],h[i]);
        }

        for(int j=h.length-2;j>=0;j--){
            right_max[j]=Math.max(h[j],right_max[j+1]);
        }
        for(int m=0;m<h.length;m++){
            max_area += Math.min(right_max[m],left_max[m])-h[m];
            
        }
        return max_area;
    }
}
