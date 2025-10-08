class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        int a=nums[n-2]*nums[n-1];
        int b=nums[0]*nums[1];
        return a-b;
        
    }
}