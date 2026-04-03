class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long n=1;
        for(int j=0;j<=rowIndex;j++){
            res.add((int)n);
            n=n*(rowIndex-j)/(j+1); 
        }
        return res;
    }
}