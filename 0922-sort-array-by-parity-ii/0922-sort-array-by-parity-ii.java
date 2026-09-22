class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int i=0;
        int j=1;
        int n=arr.length;
        while(i<n && j<n){
            if(i%2==0 && arr[i]%2==0){
                i=i+2;
            }
            else if(j%2==1 && arr[j]%2==1){
                j=j+2;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i=i+2;
                j=j+2;;
            }
        }return arr;

        
    }
}