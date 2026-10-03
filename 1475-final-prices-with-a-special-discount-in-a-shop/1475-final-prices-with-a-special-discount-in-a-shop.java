class Solution {
    public int[] finalPrices(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        int j=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<st.peek())
            st.pop();
            if(st.isEmpty()){
                ans[j]=arr[i];
                j--;
            }
            else{
                ans[j]=arr[i]-st.peek();
                j--;

            }
            st.push(arr[i]);
        }return ans;
        
    }
}