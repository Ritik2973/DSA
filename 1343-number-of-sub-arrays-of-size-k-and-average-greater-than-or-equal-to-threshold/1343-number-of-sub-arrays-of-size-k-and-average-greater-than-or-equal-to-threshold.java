class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];

        }
        int count=0;
        if(sum/k>=threshold) count++;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            int avrg=sum/k;
            
            if(avrg>=threshold){
                count++;
            }


        }return count;

        
        
    }
}