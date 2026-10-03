class Solution {
    public int minAddToMakeValid(String s) {
        int cbc = 0;
        int obc = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') {
                obc++;
            }
            else {
                if (obc > 0) {
                    obc--;
                }
                else {
                    cbc++;
                }
            }
        }

        return cbc + obc;
    }
}