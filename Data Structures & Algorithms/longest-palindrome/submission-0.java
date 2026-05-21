class Solution {
    public int longestPalindrome(String s) {
        int arr[] = new int[128];

        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int len = 0;
        boolean odd = false;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                len += arr[i];
            } 
            else {
                len += arr[i] - 1;
                odd = true;
            }
        }

        if(odd) {
            len += 1;
        }

        return len;
    }
}