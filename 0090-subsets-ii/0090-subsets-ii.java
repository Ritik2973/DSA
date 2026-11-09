class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void find(int[] arr,int idx,ArrayList<Integer> al){
        ans.add(new ArrayList<>(al));
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            // if(idx>=arr.length){
            //     ans.add(new ArrayList<>(al));
            //     return;
            // }al.add(arr[idx]);
            al.add(arr[i]);
            find(arr,i+1,al);
            al.remove(al.size()-1);
            

        }
            
        }public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            find(nums,0,new ArrayList<>());
            return ans;
        
        
    }
}