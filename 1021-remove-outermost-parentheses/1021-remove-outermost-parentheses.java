class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '(')
                count++;
            else
                count--;

            if (count == 0) {

                for (int i = left + 1; i < right; i++) {
                    ans += s.charAt(i);
                }

                left = right + 1;
            }
        }

        return ans;
    }
}