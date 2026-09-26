//Problem 1807 Leetcode
class Solution {
    public String evaluate(String s, List<List<String>> k) {

        HashMap<String, String> map = new HashMap<>();
        for (int x = 0; x < k.size(); x++) {
            map.put(k.get(x).get(0), k.get(x).get(1));
        }

        StringBuilder sb = new StringBuilder();
        int p = 0;

        while (p < s.length()) {

            if (s.charAt(p) != '(') {
                sb.append(s.charAt(p));
                p++;
                continue;
            }

            int i = p;

            int j = p + 1;
            while (s.charAt(j) != ')') {
                j++;
            }

            String key = s.substring(i + 1, j); //between '(' and ')'

            if (map.containsKey(key)) {
                sb.append(map.get(key));
            } else {
                sb.append("?");
            }

            p = j + 1;
        }

        return sb.toString();
    }
}
