class Solution {
    public int maxAbsoluteSum(int[] nums) {
        //  ISKA LOGIC YE HAI KI HM PHLE MAX SUM NIKALNGE PHIR MIN SUM AND THEN DONO KA ABS NIKAL 

        int currentMax = nums[0];
        int maxSum = nums[0];

        int currentMin = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // maximum subarray sum
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);

            // minimum subarray sum
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }

        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}
