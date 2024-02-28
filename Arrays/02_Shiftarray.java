https://leetcode.com/problems/create-target-array-in-the-given-order/
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            int indexnum = index[i];
            
            // Shift existing elements to the right
            for (int j = n - 1; j > indexnum; j--) {
                ans[j] = ans[j - 1];
            }
            
            ans[indexnum] = nums[i];
        }
        return ans;
    }
}
