class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void fun(int arr[], int idx) {
        if (idx >= arr.length) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int i : arr) {
                al.add(i);
            }ans.add(al);
            return;
        }for (int i = idx; i < arr.length; i++) {
            swap(i, idx, arr);
            fun(arr, idx + 1);
            swap(i, idx, arr);
        }
    }void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }public List<List<Integer>> permute(int[] nums) {

        fun(nums, 0);

        return ans;
    }
}