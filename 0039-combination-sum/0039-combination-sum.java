class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void find(int[] arr, int idx, int target,ArrayList<Integer> al) {
        // Target achieved
        if (target == 0) {
            ans.add(new ArrayList<>(al));
            return;
        }
        // No more elements
        if (idx >= arr.length) {
            return;
        }
        // Include current element
        if (arr[idx] <= target) {
            al.add(arr[idx]);
            // Same index because repetition is allowed
            find(arr, idx, target - arr[idx], al);
            // Backtracking
            al.remove(al.size() - 1);
        }
        // Exclude current element
        find(arr, idx + 1, target, al);
    }public List<List<Integer>> combinationSum(int[] candidates,
                                               int target) {

        find(candidates, 0, target, new ArrayList<>());

        return ans;
    }
}