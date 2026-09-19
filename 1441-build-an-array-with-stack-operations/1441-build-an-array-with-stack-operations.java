class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<String> st = new Stack<>();
        int j = 0;
        for (int i = 1; i <= n; i++) {
            st.push("Push");
            if (i == target[j]) {
                j++;
            } 
            else {
                st.push("Pop");
            }
            if (j == target.length) {
                break;
            }
        }return st;
    }
}