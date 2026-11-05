class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void find(int[] arr, int idx, ArrayList<Integer> al) {
        if (idx >= arr.length) {
            ans.add(new ArrayList<>(al));
            return;
        }
        // Include current element
        al.add(arr[idx]);
        find(arr, idx + 1, al);

        // Backtrack
        al.remove(al.size() - 1);

        // Exclude current element
        find(arr, idx + 1, al);
    }

    public List<List<Integer>> subsets(int[] nums) {
        find(nums, 0, new ArrayList<>());
        return ans;
    }
}