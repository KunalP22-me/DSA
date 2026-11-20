//Problem 17 Leetcode
class Solution {

    HashMap<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if (digits.length() == 0)
            return res;

        fun(digits, digits.length(), 0, "", res);
        return res;
    }

    private void fun(String str, int n, int idx, String note, List<String> res) {

        if (idx == n) {
            res.add(note);
            return;
        }

        String choice = map.get(str.charAt(idx));

        for (int i = 0; i < choice.length(); i++) {

            fun(str, n, idx + 1, note + choice.charAt(i), res);
        }

        return;
    }
}
