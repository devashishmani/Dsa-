class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);

        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            ans = Math.min(ans, diff);
        }

        return ans;
    }
}
