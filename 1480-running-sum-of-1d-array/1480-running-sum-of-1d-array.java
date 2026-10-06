class Solution {
    public int[] runningSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            arr[i]=sum;
        }return arr;


        
    }
}