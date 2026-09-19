class Solution {
    public int calPoints(String[] arr) {

        Stack<Integer> st = new Stack<>();

        for(String s : arr) {

            if(s.equals("C")) {

                if(!st.isEmpty()) {
                    st.pop();
                }

            } else if(s.equals("D")) {

                if(!st.isEmpty()) {
                    st.push(st.peek() * 2);
                }

            } else if(s.equals("+")) {

                int a = st.pop();
                int b = st.pop();

                st.push(b);
                st.push(a);
                st.push(a + b);

            } else {

                st.push(Integer.parseInt(s));
            }
        }

        int sum = 0;

        while(!st.isEmpty()) {
            sum = sum + st.pop();
        }

        return sum;
    }
}