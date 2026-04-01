class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String s : emails) {
            StringBuilder sb = new StringBuilder();
            boolean ignore = false;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '@') {
                    sb.append(s.substring(i)); // append domain once
                    break;
                }

                if (ignore) continue;

                if (ch == '+') {
                    ignore = true;
                } else if (ch != '.') {
                    sb.append(ch);
                }
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}