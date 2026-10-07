class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            while (j<needle.length()) {
                if (i+j >= haystack.length() ||
                    haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }j++;
            }if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}