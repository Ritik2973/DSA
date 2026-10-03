class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        int j=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])
            st.pop();
            if(st.isEmpty()){
                ans[j]=0;
                j--;
            }
            else{
                ans[j]=st.peek()-i;
                j--;

            }
            st.push(i);
        }return ans;

    }
}




