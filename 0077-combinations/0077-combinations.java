class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();

    void find(int[] arr, int idx, ArrayList<Integer> al,int k) {
        if(al.size()==k){
            ans.add(new ArrayList<>(al));return;
        }
        if (idx >= arr.length) {
            
            return;
        }
        // Include current element
        al.add(arr[idx]);
        find(arr, idx + 1, al,k);

        // Backtrack
        al.remove(al.size() - 1);

        // Exclde current element
        find(arr, idx + 1, al,k);
    }public List<List<Integer>> combine(int n, int k) {
        int nums[]=new int[n];
        for(int i=1;i<=n;i++) nums[i-1]=i;
        find(nums,0,new ArrayList<Integer>(),k);
        return ans;
        
    }
}