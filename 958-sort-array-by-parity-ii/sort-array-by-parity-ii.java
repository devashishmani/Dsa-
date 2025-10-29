class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0; 
        int oddIndex = 1;   

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenIndex] = nums[i];
                evenIndex += 2;  
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[oddIndex] = nums[i];
                oddIndex += 2;  
            }
        }

        return result;
    }
}
