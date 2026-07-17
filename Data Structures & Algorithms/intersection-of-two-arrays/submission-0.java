class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int n1:nums1){
           s1.add(n1);
        }
        for(int n2:nums2){
           s2.add(n2);
        }
        for(int i:s1){
            if(s2.contains(i)){
             result.add(i);
            }
        }
    int[] arr = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
        arr[i] = result.get(i);
    }
    return arr;
    }
}