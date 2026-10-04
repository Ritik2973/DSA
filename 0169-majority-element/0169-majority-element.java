class Solution {
    public int majorityElement(int[] arr) {
        int c=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                c=arr[i];
            }
            if(arr[i]==c){
                count++;
            }
            else{
                count--;
            }
           
        }return c;


}}