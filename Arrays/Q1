https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int q = nums.length;
        int[] ans = new int[2*n];
        int x = 0; //pointer for x1 elements
        int y = n; // pointer fr y1 elemnts
        for(int i=0;i<q;i+=2){
            ans[i] = nums[x];
            ans[i+1] = nums[y];
            x++;
            y++;
        }
        return ans;
    }
}
