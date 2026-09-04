class Solution {
    public int[] twoSum(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l< r) {
            int s= arr[l] + arr[r];
                if (s == target) {
                    return new int[]{l+ 1, r+ 1};
            }
            else if (s< target) {
                l++;
            }

            else {
                r--;
            }
        }
        return new int[]{-1, -1};
    }
}