class Solution {
    public int[] sortedSquares(int[] nums) {
        int sqrt=0;
        for(int i =0; i<nums.length;i++){
            sqrt=nums[i]*nums[i];
            nums[i]=sqrt;
        }
        Arrays.sort(nums);
        return nums;
        
        
    }
}