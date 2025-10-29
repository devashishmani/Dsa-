class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index++] = nums[i];  // index++ inside the if
            }
        }

        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[index++] = nums[i];  // index++ inside the if
            }
        }

        return result;
    }
}
