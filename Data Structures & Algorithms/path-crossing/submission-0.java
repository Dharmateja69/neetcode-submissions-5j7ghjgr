class Solution {
    public boolean isPathCrossing(String path) {
        
        Set<String> v = new HashSet<>();
        int x = 0;
        int y = 0;

        v.add("0,0");
        for(char c:path.toCharArray()){
             if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;
            String s = x +","+ y;
            if(v.contains(s)){
                return true;
            }
            v.add(s);
        }
        return false;
    }
}